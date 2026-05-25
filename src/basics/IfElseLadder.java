package basics;
import java.util.Scanner;
public class IfElseLadder {
    public static void main(String args[])
    {
        System.out.println("Student marks calculate");
        int a;
        System.out.println("Enter value for a");
        Scanner sc =new Scanner (System.in);
        a=sc.nextInt();
        if(a>=90 && a<=100)
        {
            System.out.println("a is First number in class");
        }
        else if(a>=80 && a<90)
       {
         System.out.println("a is Second number in class ");
       }
        else if(a>=70 && a<80)
        {
            System.out.println("a is Third number in class");
        }
        else if(a>=35 && a<70)
        {
            System.out.println("a is average in class");
        }
        else
        {
            System.out.println("Result : Needs Improvement");
        }


    }
}
