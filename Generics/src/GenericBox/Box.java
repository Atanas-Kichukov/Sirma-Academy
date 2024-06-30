package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }


    public List<T> getItems() {
        return items;
    }

    public Box<T> setItems(List<T> items) {
        this.items = items;
        return this;
    }


    public void add(T item) {
        items.add(item);
    }

    // Create a generic method that receives a list containing any type of data and swaps the elements
    //at two given indexes.
    public void swap(int firstIndex, int secondIndex) {
        T firstElemnt = items.get(firstIndex);
        T secondElement = items.get(secondIndex);
        items.set(firstIndex, secondElement);
        items.set(secondIndex, firstElemnt);

    }

    //Generic method to return the count of the bigger elements using compareTo
    public int getCountOfGreaterElements(T element) {
        int count = 0;
        if (items.getFirst() instanceof Integer) {

            try {
                element = (T) Integer.valueOf((String) element);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Element cannot be parsed as Integer");
            }

        } else if (items.getFirst() instanceof Double) {
            try {
                element = (T) Double.valueOf((String) element);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Element cannot be parsed as Double");
            }

        } else if (items.getFirst() instanceof Boolean) {
            try {
                element = (T) Boolean.valueOf((String) element);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Element cannot be parsed as Boolean");
            }


        }
        for (T item : items) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : items) {
            sb.append(item.getClass().getName()).append(": ").append(item).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
