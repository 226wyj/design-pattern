package decorator;

public class SideBorder extends Border {
    private final char borderChar; // Border character
    public SideBorder(Display display, char ch) { // Constructor
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() { // Number of characters + 2
        return 1 + display.getColumns() + 1;
    }
    public int getRows() { // Same as the undecorated object
        return display.getRows();
    }
    public String getRowText(int row) { // Insert border characters
        return borderChar + display.getRowText(row) + borderChar;
    }
}
