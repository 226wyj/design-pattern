package prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private final Map showCase = new HashMap();

    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showCase.get(protoname);
        return p.createClone();
    }
}
