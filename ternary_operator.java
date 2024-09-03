import java.util.Scanner;
public class ternary_operator {
    public static void main(String arg[])
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the value a: ");
       int a=input.nextInt();
       System.out.println("Enter the value b: ");
       int b=input.nextInt();
       int max=(a>b) ? a : b;
       System.out.println("maximum value is: "+max);
       input.close();
    }
    
}

