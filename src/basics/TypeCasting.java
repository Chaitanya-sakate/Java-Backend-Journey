package basics;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter value");
        Scanner sc =new Scanner (System.in);
        a=sc.nextInt();
        float b = a;
        System.out.println("Implicit TypeCasting is = "+b);
        float c;
        System.out.println("Enter value");
        c=sc.nextFloat();
        int d = (int)c;
        System.out.println("Explicit TypeCasting is = "+d);
    }
}
