package Seminar04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <N extends Warrior> implements Iterable<N>{
    private Hero hero;
    private List <N> teamList = new ArrayList<>();
    
    public Team(Hero hero) {
        this.hero = hero;
    }

    public void add(N person) {
        teamList.add(person);
    }

    @Override
    public Iterator<N> iterator() {
        return teamList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(hero.toString() + "\n");
        for (N item : this) {
            result.append(item.toString() + "\n");
        }
        return result.toString();
    }
    
    public int getTeamHealthPoint() {
        int sum = hero.getHealthPoint();
        for (N member : this) {
            sum += member.getHealthPoint();
        }
        return sum;
    }
}
