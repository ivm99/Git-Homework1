package Notes.controllers;

import Notes.model.Repository;
import Notes.model.Note;

import java.util.List;

public class NotesController {
    private final Repository repository;

    public NotesController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        validateNote(note);
        repository.CreateNote(note);
    }

    public Note readNote(int noteId) throws Exception {
        return repository.readNote(noteId);

    }

    public List<Note> readNoteList() {
        return repository.getAllNotes();
    }

    public Note updateNote(Note note) throws Exception {
        validateNote(note);
        return repository.updateNote(note);

    }

    public void deleteNote(Note note) throws Exception{
        repository.deleteNote(note);  
    }

    private void validateNote(Note note) throws Exception {
        if (note.getTitle().isEmpty()) {
            throw new Exception("Отсутствует заголовок");
        }
        if (note.getDescription().isEmpty()) {
            throw new Exception("Отсутствует описание");
        }
    }

}
