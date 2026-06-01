package basics;
import java.util.Scanner;
public class Practice {
    public static void main (String args[])
    {
        System.out.println("all basics of java");
        System.out.println("hello");
        int a;
        System.out.println("datatype is int");
        a =20;
        int b=10;
        int c= 30;
        System.out.println("variable is a : "+a);
        System.out.println("sinle line commit //");
        System.out.println("multi line commit /*     */");
        System.out.println("documentation commit //*    */");
        System.out.println("tokens 1 : int is keyword ");
        System.out.println("tokens 2 : identifier  is name a(variable name)");
        float d =30f;
        System.out.println("tokens 3 : literal : f (float value)" + d);
        System.out.println("tokens 4 : seprator { }");
        System.out.println("token 5 : oprators");
        System.out.println("arithemetic oprator :"+(a+b));
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("relational opeartor :"+(a<b));
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println("assignment operator"+(a+=b));
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
        System.out.println("logical operator "+(a>b && a<b));
        System.out.println(a>b || a<b);
        System.out.println(!(a>b));
        System.out.println("ternary operator" + ((a>b)?(a>c?a:c):(b>c?b:c)));
        System.out.println("input from user");
        int e;
        System.out.println("enter value for e");
        Scanner sc =new Scanner(System.in);
        e=sc.nextInt();
        System.out.println("enter value from user is printed :"+e);
        System.out.println("conditional statement");
        if(a<b)
        {
            System.out.println("b is greater than a");
        }
        else {
            System.out.println("a is greater than b");
        }
        System.out.println("if else if ladder");
        if(a>b)
        {
          System.out.println("max : a");
        }
        else if(b>c)
        {
           System.out.println("max : b");
        }
        else if(c>a)
        {
           System.out.println("max : c");
        }
        else
        {
            System.out.println("no is max");
        }
        System.out.println("switch statement");
        int exp;
        System.out.println("enter value for exp");
        exp = sc.nextInt();
        switch(exp)
        {
            case 1 : System.out.println("addition :"+(a+b));
            break;
            case 2 : System.out.println("substraction :"+(a-b));
            break;
            case 3 : System.out.println("multiplication :"+(a*b));
            break;
            case 4 : System.out.println("division :"+(a/b));
            break;
            default : System.out.println("no right option click");
        }
        System.out.println("nested if else");
        if(a>b)
        {
          if(a>c)
          {
             System.out.println("a is greater");
          }
          else
          {
              System.out.println("c is greater");
          }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b id greater");
            }
            else
            {
                System.out.println("c is greater");
            }
        }
        System.out.println("looping statement");
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("do while loop");
        do{
            System.out.println("it is exit control loop");
        }
        while(i<=10);
        System.out.println("for loop");
        for(i=2;i<=5;i++)
        {
            System.out.println(i);
        }
        System.out.println("nested for loop");
        for(i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
             System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println("for each loop");
        int f[]=new int[3];
         f[0]=10;
         f[1]=20;
         f[2]=30;
        for(int g:f)
        {
            System.out.println("value of array is print :"+g);
        }
        System.out.println("for each loop but 2 trick to defined array");
        int h[]={10,20,40,50};
        for(int n:h)
        {
            System.out.println("value of array is print :"+n);
        }
        System.out.println("Array elements printed by for loop ");
         int z[]={10,20,30};
        for(int m=0;m<=2;m++)
        {
            System.out.println(z[m]);
        }
        System.out.println("bitwise operator");
        System.out.println("and"+(a&b));
        System.out.println("or"+(a|b));
        System.out.println("xor"+(a^b));
        System.out.println("compliment"+(~a));











    }
}
