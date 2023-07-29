package decorator;

public class StringDisplay extends Display {
    private final String string; // String to be displayed
    public StringDisplay(String string) { // Constructor
        this.string = string;
    }
    public int getColumns() { // Get number of columns
        return string.getBytes().length;
    }
    public int getRows() { // Get number of rows
        return 1;
    }
    public String getRowText(int row) { // Get row text
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
