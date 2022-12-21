package Notes;

import Notes.controllers.NotesController;
import Notes.model.FileOperation;
import Notes.model.Repository;
import Notes.model.RepositoryFile;

import Notes.views.ViewNotes;


public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation("Seminar06_HW/Notes/notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NotesController controller = new NotesController(repository);
        ViewNotes view = new ViewNotes(controller);
        view.run();
    
    }
}
