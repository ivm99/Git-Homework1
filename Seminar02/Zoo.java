package Seminar02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Fish("Karas","Rechnoy", "silver", 0,2),new Cat("barsik","vislauh", "black", 4,6)
        ,new Dog("sedi","ratvailer", "brown", 4,2), new Duck("kru","rat", "white", 2,1), new Whale("BigFather", "BlueWhale", "black", 0, 50)));

    }

    public void talk() {
        for (SpeakAble item :getSpeakAble()) {
            System.out.printf("%s\n",item.speak());

        }
    }
    public List<SpeakAble> getSpeakAble(){
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof SpeakAble){
                result.add((SpeakAble) speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<RunAble> getRunAble(){
        List<RunAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof RunAble){
                result.add((RunAble) speakItem);
            }
        }
        return result;
    }

    public List<FlyAble> getFlyAble(){
        List<FlyAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof FlyAble){
                result.add((FlyAble) speakItem);
            }
        }
        return result;
    }

    public List<SwimAble> getSwimAble() {
        List<SwimAble> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof SwimAble) {
                result.add((SwimAble)item);
            }
        }
        return result;
    }

    public void swim() {
        for (SwimAble item : getSwimAble()) {
            System.out.printf("%s, %s\n", item.toString(),item.swim());
        }
    }

    public void run() {
        for (RunAble item :getRunAble()) {
            System.out.printf("%s,%s\n",item.toString(),item.run());

        }
    }

    public void fly() {
        for (FlyAble item :getFlyAble()) {
            System.out.printf("%s,%s\n",item.toString(),item.fly());

        }
    }


}