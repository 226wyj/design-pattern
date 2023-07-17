package abstractfactory.factory;

import java.util.ArrayList;

/**
 * A container that has multiple Link & Tray (abstract component)
 */
public abstract class Tray  extends Item {
    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
