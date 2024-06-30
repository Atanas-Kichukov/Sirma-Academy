package GenericArrayCreator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Integer[] intArr = ArrayCreator.create(5,42);
        String[] stringArr = ArrayCreator.create(3,"Word");
        Double[] doubleArr = ArrayCreator.create(6,5.5);


        Integer[] intArr2 = ArrayCreator.create(Integer.class,5,42);
        String[] stringArr2 = ArrayCreator.create(String.class,3,"Word");
        Double[] doubleArr2 = ArrayCreator.create(Double.class,6,5.5);
    }
}
