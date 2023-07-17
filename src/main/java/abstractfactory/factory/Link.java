package abstractfactory.factory;

/**
 * Represent for the HTML hyperlink (abstract component)
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
