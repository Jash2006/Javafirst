import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter the year");
        int y= scanner.nextInt();
        System.out.println(" This year is " + (((y%4==0) && (y%100!=0) ||(y%400==0)? "Leap year":" not a Leap year")));
    }
}
