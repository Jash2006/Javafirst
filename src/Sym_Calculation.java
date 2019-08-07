import java.util.Scanner;
public class Sym_Calculation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        double a= scanner.nextInt();
        System.out.println("Enter the second number");
        double b=scanner.nextInt();
        System.out.println(" Enter one symbol from +,-,* or /");
        String s= scanner.next();
        if(s.equals("+")){
            System.out.println(a+b);
            }
        else if(s.equals("-")){
            System.out.println(a+b);
        }
        else if(s.equals("*")){
            System.out.println(a*b);
        }
        else if(s.equals("/")){
            System.out.println(a/b);
        }
        else {
        }
     }
}
