import java.util.Scanner;

public class EvenOddTurn {
    public static void main( String []args){
        Scanner scanner= new Scanner( System.in);
        System.out.println(" Please enter number of your choice");
        int a= scanner.nextInt();
        System.out.println(" Please enter number of your choice");
        int b= scanner.nextInt();
        //boolean b=  a % 2 == 0 ? true : false;
        //if (b)
        System.out.println((a%2==0)?"This number is even":"This number is odd "  );
        System.out.println((b%2==0)?"This number is even":"This number is odd "  );
       // else
            //System.out.println("This number is odd " );

    }
}
