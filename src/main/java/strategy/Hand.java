package strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0; // Represent rock
    public static final int HANDVALUE_CHO = 1; // Represent scissors
    public static final int HANDVALUE_PAA = 2; // Represent paper
    public static final Hand[] hand = { // An array of three Hand instances
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = { // An array of three names
        "Rock", "Scissors", "Paper",
    };
    private final int handvalue;
    private Hand(int handvalue) { // Constructor is private
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // Get an instance by handvalue
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) { // Return true if this is stronger than h
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) { // Return true if this is weaker than h
        return fight(h) == -1;
    }
    private int fight(Hand h) { // Return 0 if drawn, 1 if this wins, -1 if this loses
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() { // Return the string representation of this hand
        return name[handvalue];
    }
}
