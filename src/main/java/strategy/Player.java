package strategy;

public class Player {
    private final String name;
    private final Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) { // Constructor
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() { // Next hand
        return strategy.nextHand();
    }

    public void win() { // Win
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose() { // Lose
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() { // Even
        gamecount++;
    }

    public String toString() { // String representation
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
