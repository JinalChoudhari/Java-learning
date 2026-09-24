package loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
long factorial = 1;// long is used here for larger might be produced in the result.
//BigInteger is the next step when you want your factorial calculator to handle arbitrarily large results.
for(int i = 1; i <=num; i++){
    factorial = factorial * i;
}
System.out.println("Factorial of" +num+ "=" +factorial );
sc.close();
    }
}
