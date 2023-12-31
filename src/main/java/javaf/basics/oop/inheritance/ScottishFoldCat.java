package javaf.basics.oop.inheritance;

import javaf.basics.oop.inheritanceI.Movable;

public final class ScottishFoldCat extends Cat implements Movable {
    public ScottishFoldCat(String name, float weight, String ownerName) {
        super(name, weight, ownerName);
    }
    public String bringSomething(boolean isDay){
        if (isDay) return "\nThe cat brought a bird.";
        return "\nThe cat brought a mouse.";
    }
    public String bringSomething(boolean isDay, boolean successfully){
        if(successfully){
            if (isDay) return "\nThe scottish fold brought the bird, well done.";
            return "\nThe scottish fold brought a mouse.";
        }
        return "\nThe scottish fold didn't bring anything. He couldn't catch someone.";
    }
    @Override
    public void run() {System.out.printf("\n%s runs fast.", super.name);}
    @Override
    public void breathe() {System.out.printf("\nLittle %d legs friend (%s) can breathe.", COUNT_LEGS, super.name);}
    @Override
    public void eat() {System.out.printf("\n%s is eating now.", super.name);}
    @Override
    public void move() {System.out.printf("\n%s moves fast.", super.name);}
}