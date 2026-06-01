package basics;

public class ForEachLoop {
    public static void main(String args[])
    {
        System.out.println("For Each Loop");
        int a[] ={10,20,30,40,50};
        for(int b:a)
        {
            System.out.println(b);
        }
        System.out.println("For Loop used & print values of Arrays");
        for(int i=0;i<5;i++) //a.lenght or i<5;
        {
            System.out.println(a[i]);
        }
    }
}
