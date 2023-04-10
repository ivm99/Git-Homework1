package Seminar05_HW.Model;

public class ComplexNum extends Num{
    
    private int real;
    private int img;
    

    public ComplexNum(int real, int img) {
        this.real = real;
        this.img = img;
    }

  

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {

        if (img == 0 )
            return real + "";
        if (real == 0)
            return img + "i";
        if (img < 0)
            return real + " - " + (-img) + "i";
        return real + " + " + img + "i";
    }
    

}
