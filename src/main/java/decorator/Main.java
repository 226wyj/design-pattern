package decorator;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world.");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(
            new FullBorder(
                new FullBorder(
                    new SideBorder(
                        new FullBorder(
                            new StringDisplay("Hello, world.")
                        ),
                        '*'
                    )
                )
            ),
            '/'
        );
        d4.show();
    }
}
