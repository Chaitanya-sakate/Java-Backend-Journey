package basics;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String args[])
    {
        int a,b,exp;
        System.out.println("Enter no for a,b");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter value for expression");
        exp=sc.nextInt();
        switch(exp)
        {
            case 1 : System.out.println("Addition : "+(a+b));
            break;
            case 2 : System.out.println("Substarction : "+(a-b));
            break;
            case 3 : System.out.println("Multiplication : "+(a*b));
            break;
            case 4 : System.out.println("division : "+(a/b));
            break;
            default:System.out.println("Stop the program");

        }


    }
}
