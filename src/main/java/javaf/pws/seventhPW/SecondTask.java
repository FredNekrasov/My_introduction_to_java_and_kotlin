package javaf.pws.seventhPW;

public class SecondTask {
    public static void main(String[] args) {
        ItemList<String> list = new ItemList<>();
        list.add("qwerty");
        list.add("0987654");
        list.add("qwerty");
        list.add("0987654");
        list.add("true");
        list.printAll();
        list.insert("Hello World", 0);
        list.insert("1234567890", 1);
        System.out.println(list.insert("123456789f", 2));
        list.printAll();
        list.delete(1);
        list.printAll();
        list.eraseAll();
        list.printAll();
    }
}
