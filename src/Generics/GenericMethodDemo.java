package Generics;

public class GenericMethodDemo {
    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        printValue(100);
        printValue("Hello Java");
        printValue(25.5);
        printValue(true);
    }
}
