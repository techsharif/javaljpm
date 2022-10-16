package section10.practice;

import java.util.ArrayList;

public class Team<T extends Player> {

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    ArrayList<T> members = new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;

        } else {
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            message = " beat ";
        } else if (ourScore < theirScore) {
            message = " lost to ";
        } else {
            message = " drew with ";
        }

        System.out.println(this.getName() + message + opponent.getName());
    }

    public int ranking() {
        return won * 2 + tied;
    }

}
