package GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scaleOfIntegers = new Scale<>(10,23);
        System.out.println(scaleOfIntegers.getHeavier());

    }
}
