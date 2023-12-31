package javaf.basics.oop.inheritance;

import javaf.basics.oop.inheritanceI.Movable;

public final class Munchkin extends Cat implements Movable {
    public Munchkin(String name, float weight, String ownerName) {
        super(name, weight, ownerName);
    }
    @Override
    public void run() {System.out.printf("\n%s runs slowly.", super.name);}
    @Override
    public void breathe() {System.out.printf("\n%s can breathe.", super.name);}
    @Override
    public void eat() {System.out.printf("\n%s is eating now.", super.name);}
    @Override
    public void move() {System.out.printf("\n%s moves slowly.", super.name);}
}