package basics;
import java.util.Scanner;
public class Operators {
    public static void main(String args[])
    {
        System.out.println("ARITHMETIC OPERATOR");
        int a,b;
        System.out.println("Enter value for a and b ");
        Scanner sc = new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition : "+(a+b));
        System.out.println("substaction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Divison : "+(a/b));
        System.out.println("Module : "+(a%b));
        System.out.println("RELATIONAL OPERATOR");
        System.out.println("Greater than : "+(a<b));
        System.out.println("Less than : "+(a<b));
        System.out.println("Equal Equal : "+(a==b));
        System.out.println("Greater than equal : "+(a<=b));
        System.out.println("Less than equal : "+(a<=b));
        System.out.println("ASSIGNMENT OPERATOR");
        int c=10;
        System.out.println("equal, c = : "+c);
        System.out.println("compound assignment addition equal " + (c+=20));
        System.out.println("compound assignment sub equal " +(c-=5));
        System.out.println("compound assignment multi eual"+(c*=2));
        System.out.println("divison equal "+(c/=5));
        System.out.println("module equal " +(c%=5));
        System.out.println("LOGICAL OPERATOR");
        System.out.println("AND = "+(a>b && a<b));
        System.out.println("OR = "+(a<=b || a>=b));
        System.out.println("NOT =" +!(a<b));
        System.out.println("INCREMENT AND DECREMENT");
        System.out.println("POST INCREMENT "+(a++));
        System.out.println("POST INCREMENT "+(a));
        System.out.println("PRE INCREMENT "+(++a));
        System.out.println("PRE INCREMENT "+(a));
        System.out.println("PRE DECREMENT "+(--b));
        System.out.println("PRE DECREMENT "+(b));
        System.out.println("POST DECREMENT "+(b--));
        System.out.println("POST DECREMENT "+(b));
        System.out.println("BITWISE OPERATOR");
        System.out.println("bitwise and"+(a & b));
        System.out.println("bitwise or"+(a | b));
        System.out.println("bitwise xor"+(a ^ b));
        System.out.println("complement"+(~a));
        System.out.println("TERNARY OPERATOR");
        int max;
        max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Maximum value in a,b"+(max));

    }
}
