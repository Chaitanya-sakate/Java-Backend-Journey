package basics;

public class VariableTypes {
    static int c =30;
        int b=20;
    public static void main (String args[])
    {
        int a=10;
        System.out.println("local variable is : "+a);
        VariableTypes ref = new VariableTypes();
        System.out.println("Instance variable is : "+(ref.b));
        System.out.println("Static variable is : "+(VariableTypes.c));
    }

}









