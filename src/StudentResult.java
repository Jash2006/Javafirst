import java.util.Scanner;

public class StudentResult {
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
        System.out.println("total marks of three subject" + "=" + (sm + mm + em));
        System.out.println("total percentage" + "=" + ((sm + mm + em) / (3)) + "%");
        if ((sm + mm + em) / (3) >= 35) {
            System.out.println("the result is pass");

        } else {
            System.out.println("the result is fail");
        }
        System.out.print("the grade is ");
        if ((sm + mm + em) / (3) >= 80) {
            System.out.print("A+");
        } else if (((sm + mm + em) / (3) >= 60)) {
            System.out.print("A");
        } else if (((sm + mm + em) / (3) >= 50)) {
            System.out.print("B");
        } else if (((sm + mm + em) / (3) >= 35)) {
            System.out.print("C");
        }
        else{
        }
    }}