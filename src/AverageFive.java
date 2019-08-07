import java.util.Scanner;

public class AverageFive {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the fist digit");
        int a= scanner.nextInt();
        System.out.println("Enter the second digit");
        int b= scanner.nextInt();
        System.out.println("Enter the third digit");
        int c= scanner.nextInt();
        System.out.println("Enter the forth digit");
        int d= scanner.nextInt();
        System.out.println("Enter the fifth digit");
        int e= scanner.nextInt();
        System.out.println("The Average of all numbers is " + ((a+b+c+d+e)/5));



    }
}
