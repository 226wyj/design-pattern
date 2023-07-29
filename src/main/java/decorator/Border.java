package decorator;

public abstract class Border extends Display {
    protected Display display; // Display to be decorated
    protected Border(Display display) { // Constructor
        this.display = display;
    }
}
