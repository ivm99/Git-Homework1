package Seminar05_HW.Controller;

import Seminar05_HW.Model.ComplexModel;
import Seminar05_HW.Model.ComplexNum;

public class UserController {
    
    private ComplexModel calc;
    
    public UserController(ComplexModel calc) {
        this.calc = calc;
    }

    public ComplexNum sum(ComplexNum num1, ComplexNum num2){
        return calc.sum(num1, num2);   
    }

    public ComplexNum sub(ComplexNum num1, ComplexNum num2){
        return calc.sub(num1, num2);   
    }

    public ComplexNum mult(ComplexNum num1, ComplexNum num2){
        return calc.mult(num1, num2);   
    }

    public ComplexNum div(ComplexNum num1, ComplexNum num2){
        return calc.div(num1, num2);   
    }

}
