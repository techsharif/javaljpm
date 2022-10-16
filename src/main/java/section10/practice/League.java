package section10.practice;

import java.util.ArrayList;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;

        } else {
            System.out.println(team.getName() + " picked for league " + this.name);
            return true;
        }
    }

    public void showLeagueTable() {
        ArrayList<T> league = this.league;

        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
