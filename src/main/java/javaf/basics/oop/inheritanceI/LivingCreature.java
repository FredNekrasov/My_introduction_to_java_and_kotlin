package javaf.basics.oop.inheritanceI;

public interface LivingCreature extends CanRun, Movable {
    @Override
    default void run() {
        CanRun.super.run();
    }
}