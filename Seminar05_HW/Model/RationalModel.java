package Seminar05_HW.Model;

public class RationalModel implements Model <RationalNum>{


    @Override
    public RationalNum sum(RationalNum num1, RationalNum num2) {
        return new RationalNum(num1.getNom()*num2.getDenom() + num1.getDenom()*num2.getNom(), num1.getDenom()*num2.getDenom());
    }

    @Override
    public RationalNum sub(RationalNum num1, RationalNum num2) {
        return new RationalNum(num1.getNom()*num2.getDenom() - num1.getDenom()*num2.getNom(), num1.getDenom()*num2.getDenom());
    }

    @Override
    public RationalNum mult(RationalNum num1, RationalNum num2) {
        return new RationalNum(num1.getNom()*num2.getNom(), num1.getDenom()*num2.getDenom());
    }

    @Override
    public RationalNum div(RationalNum num1, RationalNum num2) {
        return new RationalNum(num1.getNom()*num2.getDenom(), num1.getDenom()*num2.getNom());
    }



    
}
