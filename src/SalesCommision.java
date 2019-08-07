import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter the Employee ID");
        int i= scanner.nextInt();
        System.out.println(" Enter the Employee name");
        String name = scanner.next();
        System.out.println(" Enter the Sales Amount");
        double sa = scanner.nextDouble();
        System.out.println(" Enter the Basic Salary");
        double bs = scanner.nextDouble();
        if( sa>=50000){
            System.out.println(" The commission is " + (sa*35)/100);
        }
        else if( sa>=30000){
            System.out.println(" The commission is " + (sa*20)/100);
        }
        else if( sa>=20000){
            System.out.println(" The commission is " + (sa*10)/100);
        }
        else if( sa>=10000){
            System.out.println(" The commission is " + (sa*5)/100);
        }
        if( sa<10000){
            System.out.println(" The Sales commission is " + (sa*2)/100);
        }


    }
}
