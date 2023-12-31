package javaf.basics.oop.inheritance;

import java.util.Arrays;

abstract class Cat extends Alive{
    //Encapsulation
    protected String name;
    private float weight;
    private String ownerName;
    protected static final int COUNT_LEGS = 4;//this is constant in java
    public Cat(String name, float weight, String ownerName) {
        this.name = name;
        this.weight = weight;
        this.ownerName = ownerName;
        System.out.printf("\n%s appeared in the house.", this.name);
    }
    public final void changeInf(String name, float weight, String ownerName){
        this.name = name;
        this.weight = weight;
        this.ownerName = ownerName;
    }
    public final void getInf(){
        System.out.printf("\nCat's name is %s.\t It's weight is %.2f.\tCat owner's name is %s.", this.name, this.weight, this.ownerName);
    }
    public final void destroySofa(){System.out.printf("\n%s scratches %s's sofa", this.name, this.ownerName);}
    public final void feedTheCat(String ...product){
        System.out.printf("\nThe owner fed %d legs friend (or %s) %s", COUNT_LEGS, this.name, Arrays.toString(product));
    }
    public abstract void run();
}