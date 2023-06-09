package builder;

/**
 * Use the methods declared in Builder class to edit a document
 */
public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("From morning to afternoon");
        builder.makeItems(new String[] {
                "Good morning.",
                "Good afternoon."
        });
        builder.makeString("Evening");
        builder.makeItems(new String[] {
                "Good evening.",
                "Good night.",
                "Goodbye."
        });
        builder.close();
    }
}
