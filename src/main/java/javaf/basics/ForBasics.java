package javaf.basics;


import javaf.basics.oop.Car;
import javaf.basics.oop.inheritance.Alive;
import javaf.basics.oop.inheritance.Munchkin;
import javaf.basics.oop.inheritance.ScottishFoldCat;
import javaf.basics.oop.inheritance.Zoo;
import javaf.basics.oop.inheritanceI.Movable;
import javaf.basics.oop.testObjectFunctions.Child;
import javaf.basics.oop.testObjectFunctions.Kindergarten;
import javaf.basics.oop.testObjectFunctions.KindergartenWithGroups;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ForBasics {
    public static void variables() {
        byte a = 8;
        short b = 16;
        int c = 32;
        long d = 64L;
        //boolean e = true;
        float f = 32.30f;
        double g = 64.606060;
        int x = 10;
        x++;
        x--;
        int y = 59;
        System.out.println(a + b);
        System.out.println(y - x);
        System.out.println(c * d);
        System.out.println((float) y / x);
        System.out.println(f % g);
        char h = '\'';
        var o = "'fred" + h;//String
        System.out.println(o);
    }
    public static void ifElseTryCatchSwitch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 bool values and the day of the week number:");
        try {
            boolean bread = scanner.nextBoolean();
            boolean milk = scanner.nextBoolean();
            int dayOfTheWeek = scanner.nextInt();
            if ((!milk) && (!bread)) System.out.println("This is bad");
            else if (bread && !milk) System.out.println("it's good");
            else if (!bread) System.out.println("it's good");
            else System.out.println("well done");
            String message = milk && !bread ? "it's good": !milk && bread ? "it's good": milk ? "well done":"This is bad";
            System.out.println(message);

            switch (dayOfTheWeek){
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Are you stupid?");
            }//or you can use the command, as in C#
        }catch (InputMismatchException exception){
            System.out.println("incorrect data type");
        }
    }
    public static void arraysAndLoops(){
        int[] array = new int[2];
        int[] array1 = {4, 9, 25, 44, 49, 99};
        int[] array2 = array;
        array2[0] = 4;
        System.out.println(Arrays.toString(array));
        for (int i : array1) {
            System.out.println(i);
            if(i == 44) continue;
            System.out.println("Hello");
        }
        System.out.println(Arrays.toString(array2));
        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        int i;
        for (i = 0; i < (dayOfTheWeek.length - 2); i ++) {
            System.out.println(dayOfTheWeek[i]);
        }
        i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i--;
        }while (i > 0);
        int[] group1 = {180, 188, 189};
        int[] group2 = {179, 181, 183};
        int[][] group = {group1, group2};
        upperFor:
        for (int[] arr:group) {
            for (int number: arr) {
                System.out.println(number);
                if (number == 188) break;
                else if(number == 181) break upperFor;
            }
            System.out.println(Arrays.toString(array));
        }
    }
    public static void workWithString(){
        String a = "hello";
        String b = "hello";//stack
        //String c = new String("hello");//heap System.out.println(a.equals(b)); System.out.println(a == c);
        System.out.println(a.toUpperCase());//toLowerCase
        System.out.println(a.length());
        //System.out.println(a.contains("o")); System.out.println(a.startsWith("h")); System.out.println(a.endsWith("o"));
        System.out.println(a.replaceAll("l", "o"));
        System.out.println(a.repeat(4));
        String d = "1, 2, 3, 4, 5, 6, 7, 8, 9";
        String[] e = d.split(", ");
        System.out.println(Arrays.toString(e));
        System.out.println(b.concat(a));
        System.out.println(b.substring(0,4));
        String str = String.format("He said %s", a);
        System.out.println(str);
        System.out.printf("He said %s", a);
        String x = "world";
        x += "!";
        String y = """
                |\thello %s
                |this is text block
                |jetpack compose
                |etc""".formatted(x);
        System.out.println(y);
    }
    public int recursion(int n){
        if (n < 1) return 0;
        int result = n + recursion(n - 1);
        return result;
    }
    public static void testOOP(){
        Munchkin milo = new Munchkin("Milo", 4.9f, "fred");//tobi, buddy, jasper, loki, jack, gas, gizmo, kitty, winston
        ScottishFoldCat jack = new ScottishFoldCat("Jack", 5.6f, "Alan");
        jack.destroySofa();
        System.out.println(jack.bringSomething(true, true));
        milo.feedTheCat("food, fish");
        milo.getInf();
        milo.run();
        //Polymorphism
        Alive[] animals = {milo, jack};
        for (Alive pet: animals) {
            if(pet instanceof ScottishFoldCat littleFriend) System.out.println(littleFriend.bringSomething(true));//if(pet instanceof ScottishFoldCat) System.out.println(((ScottishFoldCat) pet).bringSomething(true));
            pet.breathe();
            pet.eat();
        }
        Car audi = new Car("Audi");
        Car bmv = new Car("BMV");
        System.out.printf("On %d place is %s.\n", audi.getCountOfCars(), audi.getBrand());
        System.out.printf("On %d place is %s.\n", bmv.getCountOfCars(), bmv.getBrand());
        System.out.println(Car.getBrandModels());
        Movable airplane = () -> System.out.print("\nAirplane moves fast.");//It's like creating a dog class, implementing a move method and immediately deleting it. this is due to functional interfaces
        Movable[] movables = new Movable[3];
        movables[0] = milo;
        movables[1] = bmv;
        movables[2] = airplane;
        for (Movable move: movables) {
            move.move();
            if(move instanceof Alive) System.out.print(" It's alive.");
            else System.out.print(" It's not alive.");
        }
        //Zoo forMunchkin = new Zoo(milo); Zoo forScottishFold = new Zoo(jack);
    }
    public static void testObjectClass() throws CloneNotSupportedException {
        Child fred = new Child("Fred", 4);
        Child alex = new Child("Alex", 5);
        Child kate = new Child("Kate", 4);
        Child elizabeth = new Child("Elizabeth", 5);
        Child[] children = {fred, alex, kate, elizabeth};
        Kindergarten kindergarten = new Kindergarten(children);
        boolean result = false;
        Child childForFind = new Child("Alex", 5);
        for (Child child : kindergarten.getChildren()) {
            if (child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        Child[] group1 = {fred, kate};
        Child[] group2 = {alex, elizabeth};
        Child[][] groups = {group1, group2};
        KindergartenWithGroups kindergartenWithGroups = new KindergartenWithGroups(groups);
        for (Child child: kindergartenWithGroups.getGroups()[childForFind.hashCode()]) {
            if (child.equals(childForFind)){
                result = true;
                break;
            }
        }
        System.out.println(result);
        Child[] children1 = make10Clones(fred);
        for (Child clone: children1) {
            System.out.println(clone.getName());
        }
    }
    public static Child[] make10Clones(Child child) throws CloneNotSupportedException {
        Child[] children = new Child[10];
        for (int i = 0; i < 10; i++) {
            children[i] = (Child) child.clone();
        }
        return children;
    }
    public static void enumAndAnonymousClass(){
        System.out.println(Countries.valueOf("JAPAN").getCountOfPeople());
        int number = Integer.parseInt("49");
        System.out.println(number);
        Movable dog = new Movable() {
            @Override
            public void move() {
                System.out.println("Dog moves fast");
            }
        };//Anonymous class
        dog.move();
    }
    public static void innerClass(){
        Zoo owner = new Zoo("fred", true, true);
        System.out.println(owner);
    }
}