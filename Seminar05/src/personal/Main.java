package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;

import personal.model.Repository;
import personal.model.RepositoryFile2;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        // FileOperation fileOperation = new FileOperationImpl("users.txt");
        FileOperation fileOperation2 = new FileOperationImpl("users2.txt");
        System.out.println(fileOperation2);
        // Repository repository = new RepositoryFile(fileOperation);
        Repository repository2 = new RepositoryFile2(fileOperation2);
        System.out.println(repository2);
        // UserController controller = new UserController(repository);
        UserController controller2 = new UserController(repository2);
        System.out.println(controller2);
        ViewUser view = new ViewUser(controller2);
        System.out.println(view);
        view.run();
    }
}
