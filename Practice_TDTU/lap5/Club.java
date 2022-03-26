package Practice_TDTU.lap5;


public class Club {
    private String name;
    private int wins;
    private int draws;
    private int losses;

    public Club() {
        this.name = "";
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
    }
    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    public Club(Club club) {
        this.name = club.name;
        this.wins = club.wins;
        this.draws = club.draws;
        this.losses = club.losses;
    }

    public String getName() {
        return name;
    }
    public int getWins() {
        return wins;
    }
    public int getDraws() {
        return draws;
    }
    public int getLosses() {
        return losses;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }
    public int numMatchesPlayed() {
        return wins + draws + losses;
    }

    public boolean isFinish() {
        if(numMatchesPlayed() >= 10) return true;
        return false;
    }
    public int getPoints() {
        return wins * 3 + draws  * 1 + losses * 0;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.wins + "/" + this.draws + "/";
    }


}