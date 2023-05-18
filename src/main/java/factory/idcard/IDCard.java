package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {
    final private String owner;

    public IDCard(final String owner) {
        System.out.printf("Making %s's ID Card%n", owner);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.printf("Using %s's ID Card%n", owner);
    }
}
