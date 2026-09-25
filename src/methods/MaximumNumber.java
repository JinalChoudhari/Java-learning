package methods;
import java.util.Scanner;
public class MaximumNumber {
    static int findMaximum(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third Number");
        int c = sc.nextInt();
        int maximum = findMaximum(a, b, c);
        System.out.println("maximum number: " +maximum);
        sc.close();
    }
}
