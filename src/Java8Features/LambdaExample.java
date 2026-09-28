package Java8Features;
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
public class LambdaExample {
    public static void main(String[] args) {

        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;

        // Lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
    }
}
