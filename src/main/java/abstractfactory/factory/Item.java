package abstractfactory.factory;

/**
 * The parent class for the abstract components
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
