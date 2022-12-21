package Notes.model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class RepositoryFile implements Repository {
    private iFileOperation fileOperation;
    private NoteMapper mapper = new NoteMapper();

    public RepositoryFile(iFileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }


    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public int CreateNote(Note note) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = item.getId();
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        //String id = String.format("%d", newId);
        note.setId(newId);
        note.setDate(new GregorianCalendar());
        notes.add(note);
        saveNotes(notes);
        return newId;
    }

    protected void saveNotes(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public Note updateNote(Note note) throws Exception {
        List<Note> notes = getAllNotes();
        Note foundNote = findNoteById(notes, note.getId());
        foundNote.setTitle(note.getTitle());
        foundNote.setDescription(note.getDescription());
        foundNote.setDate(new GregorianCalendar());
        saveNotes(notes);
        return foundNote;
    }

    @Override
    public Note readNote(int noteId) throws Exception {
        List<Note> notes = getAllNotes();
        return findNoteById(notes, noteId);
    }

    protected Note findNoteById(List<Note> notes, int noteId) throws Exception {
        for (Note note : notes) {
            if (note.getId() == noteId) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    @Override
    public void deleteNote(Note user) throws Exception {
        List<Note> users = getAllNotes();
        Note foundUser = findNoteById(users, user.getId());
        users.remove(foundUser);
        saveNotes(users);
        
    }

}
