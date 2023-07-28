package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private final String name;
    private final ArrayList<Entry> directory = new ArrayList<Entry>();

    public Directory(String name) { // Constructor
        this.name = name;
    }

    public String getName() { // Get name
        return name;
    }

    public int getSize() { // Get size
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) { // Add entry
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) { // Print list
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
