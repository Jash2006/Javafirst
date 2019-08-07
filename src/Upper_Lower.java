import javax.swing.text.ChangedCharSetException;
import java.util.Scanner;

public class Upper_Lower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter any alphabet in UpperCase");
        char c= scanner.next().charAt(0);
        int i;
        i= (int)c;
        i=i+32;
        c=(char)i;
       System.out.println(c);
        System.out.println(" Enter any alphabet in Lower Case");
        char d= scanner.next().charAt(0);
        int j;
        j= (int)d;
        j=j-32;
        d=(char)j;
        System.out.println(d);
    }

}
