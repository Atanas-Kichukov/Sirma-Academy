package GenericScale;

public class Scale<T extends Comparable<T>>  {

    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public Scale<T> setLeft(T left) {
        this.left = left;
        return this;
    }

    public T getRight() {
        return right;
    }

    public Scale<T> setRight(T right) {
        this.right = right;
        return this;
    }

    public T getHeavier(){
        int number = left.compareTo(right);
        if(number == 0){
            return null;
        }else if(number >0){
            return left;
        }else{
            return right;
        }
    }
}
