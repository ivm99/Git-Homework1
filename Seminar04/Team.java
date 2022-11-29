package Seminar04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{
    private Hero hero;
    private List <T> teamList = new ArrayList<>();
    
    public Team(Hero hero) {
        this.hero = hero;
    }

    public void add(T person) {
        teamList.add(person);
    }

    @Override
    public Iterator<T> iterator() {
        return teamList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(hero.toString() + "\n");
        for (T item : this) {
            result.append(item.toString() + "\n");
        }
        return result.toString();
    }
    
    public int getTeamHealthPoint() {
        int sum = hero.getHealthPoint();
        for (T member : this) {
            sum += member.getHealthPoint();
        }
        return sum;
    }
}
