package basics;
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String args[]) {
       System.out.println("find max value in three number");
       int a,b,c;
       System.out.println("Enter value for a,b,c");
       Scanner sc =new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>=b)
       {
           if(a>=c)
           {
           System.out.println("max value is a");
           }
           else
           {
            System.out.println("max value is c");
           }

       }
       else
       {
           if(b>=c)
           {
            System.out.println("max value is b");
           }
           else
           {
            System.out.println("max value is c");
           }

       }

    }
}



