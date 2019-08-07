import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class InterChange {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number");
        int a =scanner.nextInt();
        System.out.println("Enter second number");
        int b =scanner.nextInt();
        System.out.println((a==a)? b:a );
        System.out.println((b==b)? a:b );






    }




}
