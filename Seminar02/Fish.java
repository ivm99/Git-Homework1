package Seminar02;

public class Fish extends Animal implements SwimAble{

    public Fish(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String swim() {
        return "20 km/h";
    }

}
