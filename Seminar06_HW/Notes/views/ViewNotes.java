package Notes.views;

import Notes.controllers.NotesController;
import Notes.model.Note;
import java.util.List;
import java.util.Scanner;

public class ViewNotes {

    private NotesController notesController;

    public ViewNotes(NotesController notesController) {
        this.notesController = notesController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        Note note = setNote(false);
                        notesController.saveNote(note);
                        break;
                    case READ:
                        try {
                            int id = Integer.parseInt(prompt("Идентификатор пользователя: "));
                            Note readedUser = notesController.readNote(id);
                            System.out.println(readedUser);
                        } catch (Exception e) {
                            System.out.println("Требуется ввести число");
                        }    
                        break;
                    case LIST:
                        List<Note> userList = notesController.readNoteList();
                        for (Note u : userList) {
                            System.out.println(u);
                            System.out.println();
                        }
                        break;
                    case UPDATE:
                        Note updateUser = setNote(true);
                        notesController.updateNote(updateUser);
                        break;
                    case DELETE:
                        try {
                            int userId = Integer.parseInt(prompt("Идентификатор пользователя: "));
                            Note needTodeleteUser = notesController.readNote(userId);
                            notesController.deleteNote(needTodeleteUser);
                        } catch (Exception e) {
                            System.out.println("Требуется ввести число");
                        }
                        break; 
                    case INFO:
                        System.out.printf("Список доступных команд: \n"+
                        "  READ\n" +
                        "  CREATE\n"+
                        "  UPDATE\n"+
                        "  LIST\n"+
                        "  DELETE\n"+
                        "  INFO\n"+
                        "  EXIT\n");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Note setNote(boolean forUpdate) {
        int id = 0;
        if (forUpdate) {
            id = Integer.parseInt(prompt("Id: "));

        }

        String title = prompt("Заголовок: ");
        String description = prompt("Описание: ");
        if (forUpdate) {
            return new Note(id, title, description);
        }
        return new Note(title, description);

    }
}
