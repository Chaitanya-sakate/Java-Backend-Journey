package basics;

public class NestedForLoop {
    public static void main(String args[]) {
        int i, j;
        for (i=1; i<=5; i++)//row
        {
            for (j=1; j<=5; j++)//colum
            {
                System.out.print("*");
            }
            System.out.println();
        }


//        for(int a=3;a>=1;a--)
//        {
//            for(int b=3;b>=1;--b)
//            {
//              System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
