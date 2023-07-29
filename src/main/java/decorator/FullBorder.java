package decorator;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    public int getColumns() { // Number of characters + 2
        return 1 + display.getColumns() + 1;
    }
    public int getRows() { // Number of rows + 2
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) { // Insert border characters
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) { // Make a line of characters
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
