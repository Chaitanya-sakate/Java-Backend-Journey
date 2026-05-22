package basics;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String args[])
    {
        int A1;
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        A1=sc.nextInt();
        System.out.println("Take Integer input from user A1 = "+A1);
        String b;
        b = sc.nextLine();
        System.out.println("Take String input from user b = "+b);


    }
}
