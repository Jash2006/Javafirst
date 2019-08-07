import java.util.Scanner;

public class StudentPassFail {
    public static void main(String arg[]) {

        System.out.println("enter the student name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("enter the roll no");
        int roll = scanner.nextInt();
        System.out.println("Enter the science marks");
        int sm = scanner.nextInt();
        System.out.println("Enter the maths marks");
        int mm = scanner.nextInt();
        System.out.println("Enter the english marks");
        int em = scanner.nextInt();
        System.out.println((sm>=35 && mm>=35 && em>=35)? "Pass":"Fail" );

    }
}