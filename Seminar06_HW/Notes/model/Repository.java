package Notes.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    int CreateNote(Note user);
    Note updateNote(Note user) throws Exception;
    Note readNote(int userId) throws Exception;
    void deleteNote(Note user) throws Exception;
    

}
