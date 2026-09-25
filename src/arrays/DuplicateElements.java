package arrays;
import java.util.Scanner;
public class DuplicateElements {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements:");
    int n = sc.nextInt();
    int[] numbers = new int[n];
    System.out.println("Enter "+n+ " numbers:");
    for(int i=0; i<n; i++){
        numbers[i] = sc.nextInt();
    }
    System.out.println("Duplicate elements:");
    for(int i=0; i<n; i++){
        for(int j = i+1; j<n; j++){
            if(numbers[i] == numbers[j]) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }

sc.close();
}
}
//here if number appears more than twice it will print that number two times or more
//for such complications HashSet is used