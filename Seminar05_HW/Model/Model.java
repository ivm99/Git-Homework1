package Seminar05_HW.Model;

public interface Model <T extends Num> {
    
    T sum(T num1, T num2);
    T sub(T num1, T num2);
    T mult(T num1, T num2);
    T div(T num1, T num2);

}
