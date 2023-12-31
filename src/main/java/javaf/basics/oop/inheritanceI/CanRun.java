package javaf.basics.oop.inheritanceI;

@FunctionalInterface
public interface CanRun {
    void canNotRun();
    default void run(){
        System.out.println("Living creature can run");
    }
}