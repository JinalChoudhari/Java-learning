package strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String reverse = "";
    for(int i = str.length() - 1; i>=0; i--){
reverse = reverse + str.charAt(i);
    }
    if(str.equals(reverse)) //for comparing String contents, because == checks whether the two references point to the same object.
    {
        System.out.println(str + " is Palindrome");
    }
    else{
        System.out.println(str + " is not Palindrome");
    }
    sc.close();
    }
}




