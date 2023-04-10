package Seminar05_HW.Controller;

import Seminar05_HW.Model.ComplexModel;
import Seminar05_HW.Model.ComplexNum;
import Seminar05_HW.Model.Model;
import Seminar05_HW.Model.Num;

public class CalcController {
    
    private final Model calc;
    
    public CalcController(Model calc) {
        this.calc = calc;
    }

    public Num sum(Num num1, Num num2){
        return calc.sum(num1, num2);   
    }

    public Num sub(Num num1, Num num2){
        return calc.sub(num1, num2);   
    }

    public Num mult(Num num1, Num num2){
        return calc.mult(num1, num2);   
    }

    public Num div(Num num1, Num num2){
        return calc.div(num1, num2);   
    }

}
