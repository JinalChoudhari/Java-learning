package Collection;
import java.util.HashMap;
public class FrequencyExample {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {

            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }
        }

        System.out.println("Frequency: " + frequency);
    }
}
