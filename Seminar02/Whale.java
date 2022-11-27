package Seminar02;

public class Whale extends Animal implements SwimAble {

    public Whale(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
        
    }
    


    @Override
    public String swim() {
        return "50 km/h";
    }}
