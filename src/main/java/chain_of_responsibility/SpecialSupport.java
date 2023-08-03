package chain_of_responsibility;

public class SpecialSupport extends Support {
    private final int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
