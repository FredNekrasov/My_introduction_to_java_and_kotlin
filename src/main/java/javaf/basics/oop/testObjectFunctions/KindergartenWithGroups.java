package javaf.basics.oop.testObjectFunctions;

public class KindergartenWithGroups {
    private final Child[][] groups;
    public KindergartenWithGroups(Child[][] groups) {
        this.groups = groups;
    }
    public Child[][] getGroups() {
        return groups;
    }
}