package Seminar05_HW.Model;

public class CalcModel implements Model {

    @Override
    public ComplexNum sum(ComplexNum num1, ComplexNum num2) {
            return new ComplexNum(num1.getReal() + num2.getReal(), num1.getImg() + num2.getImg());
    }

    @Override
    public ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.getReal() - num2.getReal(), num1.getImg() - num2.getImg());
    }

    @Override
    public ComplexNum mult(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.getReal() * num2.getReal() - num1.getImg() * num2.getImg(), num1.getImg() * num2.getReal() + num1.getReal() * num2.getImg());
    }

    @Override
    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum((num1.getReal() * num2.getReal() + num1.getImg() * num2.getImg()) / (num2.getReal() * num2.getReal() + num2.getImg() * num2.getImg()),
        (num1.getImg() * num2.getReal() - num1.getReal() * num2.getImg()) / (num2.getReal() * num2.getReal() + num2.getImg() * num2.getImg()));
    }

    
}
