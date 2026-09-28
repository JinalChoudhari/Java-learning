package Collection;
import java.util.Scanner;
import java.util.ArrayList;
public class AraayListPractice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        // Adding elements
        names.add("Jinal");
        names.add("Rahul");
        names.add("Priya");
        names.add("Aman");

        System.out.println("Names: " + names);

        // Get an element
        System.out.println("First name: " + names.get(0));

        // Change an element
        names.set(1, "Riya");
        System.out.println("After changing: " + names);

        // Remove an element
        names.remove("Aman");
        System.out.println("After removing: " + names);

        // Check if an element exists
        System.out.print("Enter a name to search: ");
        String searchName = sc.nextLine();

        if (names.contains(searchName)) {
            System.out.println(searchName + " is present.");
        } else {
            System.out.println(searchName + " is not present.");
        }

        // Size of ArrayList
        System.out.println("Total names: " + names.size());

        sc.close();
    }
}
