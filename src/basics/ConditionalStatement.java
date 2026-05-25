package basics;
import java.util.Scanner;
public class ConditionalStatement
{
    public static void main(String args[])
    {
        System.out.println("IF STATEMENT");
        int a;
        System.out.println("Enter value for a");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a>=0)
        {
            System.out.println("A is Positive number");
        }
        System.out.println("IF ELSE STATEMENT");
        int b;
        System.out.println("Enter value for b");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }

    }
}
