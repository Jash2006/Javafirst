import java.util.Scanner;

public class FindNumAlphaSymb {
    public static void main(String[]args){
        Scanner scanner= new Scanner( System.in);
        System.out.println(" Please enter your desired value");
        //double a = scanner.nextDouble();
        char b= scanner.next().charAt(0);
        // String c= scanner.next();
        int i;
        i=(int)b;
        //b=(char)i;

        if( i >= 48 && i <=57){
            System.out.println("Numeric");
        }
        else if(( i>=97 && i<=122) || ( i>=65 && i<=90 )){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Symbol");
        }

    }
}
