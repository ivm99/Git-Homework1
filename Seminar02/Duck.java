package Seminar02;

public class Duck extends Animal implements SpeakAble,FlyAble,RunAble,SwimAble{

    public Duck(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String fly() {
        return "90 км/ч";
    }

    @Override
    public String run() {
        return "10 km/h";
    }

    @Override
    public String speak() {
        return "krya";
    }

    @Override
    public String swim() {
        return "3 km/h";
    }

    
}
