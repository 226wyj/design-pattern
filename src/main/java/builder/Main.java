package builder;

public class Main {

    private static void usage() {
        System.out.println("Usage: java Main plain - edit a text document");
        System.out.println("Usage: java Main html - edit a html document");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println("Finish writing file: " + fileName);
        } else {
            usage();
            System.exit(0);
        }
    }
}
