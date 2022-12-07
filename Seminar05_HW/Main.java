package Seminar05_HW;

import Seminar05_HW.Controller.UserController;
import Seminar05_HW.Model.CalcModel;
import Seminar05_HW.View.ViewCalc;

public class Main {
    public static void main(String[] args) {
        CalcModel calc = new CalcModel();
        UserController userController = new UserController(calc);
        LogManager logManager = new LogManager("Seminar05_HW/Log.log");
        ViewCalc viewCalc = new ViewCalc(userController, logManager);
        viewCalc.run();
    }
}
