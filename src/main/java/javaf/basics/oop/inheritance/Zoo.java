package javaf.basics.oop.inheritance;

public class Zoo {
    private Cat cat;
    private Owner owner;
    private Heart heart;
    public Zoo(Cat cat) {
        this.cat = cat;
        System.out.printf("\nThe best pet is %s", cat.name);
    }
    public Zoo(Munchkin munchkin){
        this.cat = munchkin;
        System.out.println("The best pet is munchkin");
    }

    public Zoo(String name, boolean passport, boolean hasHeart) {
        this.owner = new Owner(name, passport);
        this.heart = new Heart(hasHeart);
    }

    @Override
    public String toString() {
        return "Zoo{ owner=" + owner + ", heart=" + heart + '}';
    }

    public static class Owner {
        private final String name;
        private final boolean passport;

        public Owner(String name, boolean passport) {
            this.name = name;
            this.passport = passport;
        }

        @Override
        public String toString() {
            return "Owner{" + "name='" + name + '\'' + ", passport=" + passport + '}';
        }
    }

    public static class Heart {
        private final boolean hasHeart;

        public Heart(boolean hasHeart) {
            this.hasHeart = hasHeart;
        }
        @Override
        public String toString() {
            return "Heart{" + "hasHeart=" + hasHeart + '}';
        }
    }
}