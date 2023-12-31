package javaf.basics.oop.testObjectFunctions;

public class Kindergarten {
    private final Child[] children;
    public Kindergarten(Child[] children) {
        this.children = children;
    }
    public Child[] getChildren() {
        return children;
    }
}