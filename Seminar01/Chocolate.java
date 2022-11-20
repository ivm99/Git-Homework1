package Seminar01;

public class Chocolate extends Product{
    private int cacaoContent;

    public Chocolate (String name) {
        super(name);
    }

    public Chocolate (String name, double price) {
        super(name, price);
    }

    public Chocolate (String name, double price, int cacaoContent) {
        super(name, price);
        this.cacaoContent = cacaoContent;
    }

    public int getCacaoContent() {
        return cacaoContent;
    }

    public void setCacaoContent(int cacaoContent) {
        this.cacaoContent = cacaoContent;
    }

    @Override
    public String toString() {
        return String.format("%s \tсодержание какао: %d", super.toString(), getCacaoContent());
    }
}
