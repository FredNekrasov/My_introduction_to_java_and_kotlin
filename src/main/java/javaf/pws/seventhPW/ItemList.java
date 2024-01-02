package javaf.pws.seventhPW;

import java.util.ArrayList;
import java.util.List;

public class ItemList<T> implements IRemove, IPrintList, IClearList {
    private List<T> itemList = new ArrayList<>();
    public void add(T el) {
        itemList.add(el);
    }
    public boolean insert(T el, int n) {
        if (n >= 0 && n < itemList.size()) {
            itemList.add(n, el);
            return true;
        }
        return false;
    }
    @Override
    public void eraseAll() {
        itemList.clear();
    }

    @Override
    public void printAll() {
        itemList.forEach(System.out::println);
    }

    @Override
    public void delete(int n) {
        itemList.remove(n);
    }
}