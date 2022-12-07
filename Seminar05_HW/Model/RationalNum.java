package Seminar05_HW.Model;

public class RationalNum{
    
    private int nom;
    private int denom;
    
    public RationalNum(int nominator, int denominator) {
        this.nom = nominator;
        this.denom = denominator;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nominator) {
        this.nom = nominator;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denominator) {
        this.denom = denominator;
    }

    @Override
    public String toString() {
        return nom + "/" + denom;
    }


}
