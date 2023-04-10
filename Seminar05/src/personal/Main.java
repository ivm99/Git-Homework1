package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;

import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.model.UserMapper;
// import personal.model.RepositoryFile2;
import personal.model.UserMapper2;
import personal.model.iUserMap;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        // FileOperation fileOperation = new FileOperationImpl("users2.txt");
        FileOperation fileOperation2 = new FileOperationImpl("Seminar05/users2.txt");
        // Repository repository = new RepositoryFile(fileOperation);
        iUserMap mapper = new UserMapper2();
        Repository repository2 = new RepositoryFile(mapper, fileOperation2);
        // UserController controller = new UserController(repository);
        UserController controller2 = new UserController(repository2);
        ViewUser view = new ViewUser(controller2);
        view.run();
    }
}
