package Seminar05_HW.Controller;

import Seminar05_HW.Model.RationalModel;
import Seminar05_HW.Model.RationalNum;

public class UserController2 {
    
    private RationalModel calc;
    
    public UserController2(RationalModel calc) {
        this.calc = calc;
    }

    public RationalNum sum(RationalNum num1, RationalNum num2){
        return calc.sum(num1, num2);   
    }

    public RationalNum sub(RationalNum num1, RationalNum num2){
        return calc.sub(num1, num2);   
    }

    public RationalNum mult(RationalNum num1, RationalNum num2){
        return calc.mult(num1, num2);   
    }

    public RationalNum div(RationalNum num1, RationalNum num2){
        return calc.div(num1, num2);   
    }

}
