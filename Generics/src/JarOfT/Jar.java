package JarOfT;

import java.util.ArrayList;
import java.util.List;

public class Jar<T> {

    private List<T> items;

    public Jar() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public Jar<T> setItems(List<T> items) {
        this.items = items;
        return this;
    }



    public void add(T element){
        this.items.add(element);
    }

    public void remove(T element){
        this.items.remove(element);
    }
}