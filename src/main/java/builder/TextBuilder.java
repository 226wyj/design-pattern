package builder;

/**
 * Use plain text to edit a document
 */
public class TextBuilder extends Builder {
    private final StringBuilder builder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        builder.append("====================\n");
        builder.append("[").append(title).append("]\n");
        builder.append("\n");
    }

    @Override
    public void makeString(String str) {
        builder.append("🟥").append(str).append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            builder.append("  .").append(item).append("\n");
        }
        builder.append("\n");
    }

    @Override
    public void close() {
        builder.append("====================\n");
    }

    public String getResult() {
        return builder.toString();
    }
}
