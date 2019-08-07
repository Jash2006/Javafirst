import java.util.Scanner;
public class FindEvenOdd {
     public static void main( String[]args){
        Scanner scanner= new Scanner(System.in);
         System.out.println("Enter the first number");
         int a= scanner.nextInt( );
         System.out.println("Enter the second number");
         int b= scanner.nextInt( );
         System.out.println(" The first number is " + ((a%2==0)? "even number":"odd number"));
         System.out.println(" The second  number is " + ((b%2==0)? "even number":"odd number"));
     }
}
