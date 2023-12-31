package javaf.basics.oop;

import javaf.basics.oop.inheritanceI.Movable;

import java.util.Arrays;

public class Car implements Movable {
    private String brand;
    public static int countOfCars;
    private static final String brandModels = "BMV, Audi, Nissan.";
    public final static String[] modelsDescription = new String[3];
    static {
        modelsDescription[0] = "BMV bla bla.";
        modelsDescription[1] = "Audi bla bla.";
        modelsDescription[2] = "Nissan bla bla.";
        System.out.println(Arrays.toString(Car.modelsDescription));
    }

    public Car(String brand) {
        this.brand = brand;
        countOfCars++;
        System.out.printf("%s was created.\n", this.brand);
    }
    public int getCountOfCars() {
        return countOfCars;
    }
    public static String getBrandModels() {
        return brandModels;
    }
    public String getBrand() {
        return brand;
    }
    public void move(){System.out.printf("\n%s moves fast.", this.brand);}
}