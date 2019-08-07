import java.util.Scanner;

public class Vote_Eligibility {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter the age");
        int a= scanner.nextInt();
        System.out.println (a>=18? "Eligible for Voting": "Not Eligible for Voting" );
    }
}
