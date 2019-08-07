import java.util.Scanner;

public class Emp_Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Employee ID");
        int id= scanner.nextInt();
        System.out.println("Employee name");
        String name= scanner.next();
        System.out.println("Basic Salary");
        int bs = scanner.nextInt();
        System.out.println("HRA"+"="+((bs)*10/100));
        System.out.println("DA"+"="+((bs)*8)/100);
        System.out.println("TA"+"="+((bs)*9/100));
        System.out.println("PF"+"="+((bs)*20/100));
        System.out.println("Gross Salary is"+"="+(bs + ((bs)*10/100) + ((bs)*8)/100 + ((bs)*9/100)-((bs)*20/100)) );



    }
}
