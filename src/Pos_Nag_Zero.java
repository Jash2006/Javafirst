import java.util.Scanner;

public class Pos_Nag_Zero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Number");
        long a= scanner.nextLong();
        if (a>0){
            System.out.println(" This number is positive");
        }
        else if(a<0){
            System.out.println(" This number is negative");
        }
        else{
            System.out.println(" This number is zero");
        }
    }
}
