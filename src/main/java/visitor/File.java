package visitor;

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

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
