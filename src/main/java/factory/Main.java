package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Mike");
        Product card2 = factory.create("Tom");
        Product card3 = factory.create("Jesse");
        card1.use();
        card2.use();
        card3.use();
    }
}
