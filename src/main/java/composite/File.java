package composite;

public class File extends Entry {
    private final String name;
    private final int size;

    public File(String name, int size) { // Constructor
        this.name = name;
        this.size = size;
    }

    public String getName() { // Get name
        return name;
    }

    public int getSize() { // Get size
        return size;
    }

    protected void printList(String prefix) { // Print list
        System.out.println(prefix + "/" + this);
    }
}
