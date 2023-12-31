package javaf.basics.oop.testObjectFunctions;

public class Child implements Cloneable {
    private final String name;
    private final int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public int getAge() {return age;}

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            if (obj instanceof Child child) return this.getName().equals(child.getName()) && this.getAge() == child.getAge();
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.getAge() % 2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}