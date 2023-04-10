package Seminar05_HW;

import Seminar05_HW.Controller.CalcController;
import Seminar05_HW.Controller.UserController2;
import Seminar05_HW.Model.ComplexModel;
import Seminar05_HW.Model.ComplexNum;
import Seminar05_HW.Model.Model;
import Seminar05_HW.Model.RationalModel;
import Seminar05_HW.Model.RationalNum;
import Seminar05_HW.View.ViewCalc;
import Seminar05_HW.View.ViewCalc2;

public class Main {
    public static void main(String[] args) {
        Model<ComplexNum> calc = new ComplexModel();
        CalcController calcController = new CalcController(calc);
        LogManager logManager = new LogManager("Seminar05_HW/Log.log");
        ViewCalc viewCalc = new ViewCalc(calcController, logManager);
        viewCalc.run();
        // RationalModel calc = new RationalModel();
        // UserController2 userController = new UserController2(calc);
        // LogManager logManager = new LogManager("Seminar05_HW/Log.log");
        // ViewCalc2 viewCalc = new ViewCalc2(userController, logManager);
        // viewCalc.run();
    }
}
