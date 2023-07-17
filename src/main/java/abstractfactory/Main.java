package abstractfactory;

import abstractfactory.factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("People", "http://www.people.com");
        Link gmw = factory.createLink("Gmw", "http://www.gmw.com");

        Link usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link japanYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray traynews = factory.createTray("News");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(usYahoo);
        trayyahoo.add(japanYahoo);

        Tray traysearch = factory.createTray("Search Engine");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "James");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
