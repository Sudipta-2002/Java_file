import java.util.Scanner;
public class if_else {
    public static void main(String arg[])
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the value a: ");
       int a=input.nextInt();
       System.out.println("Enter the value b: ");
       int b=input.nextInt();
       if(a>b)
           System.out.println("maximum value is: "+a);
       else
           System.out.println("maximum value is: "+b);
    input.close();
    }
    
}
