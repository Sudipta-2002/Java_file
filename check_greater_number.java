import java.util.Scanner;
public class check_greater_number {
        public static void main(String arg[])
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a=input.nextInt();
            System.out.println("Enter the value of b");
            int b=input.nextInt();
            System.out.println("Enter the value of c");
            int c=input.nextInt();
            if(a>b & a>c)
            System.out.println("A is greatest");
            else if(b>b & b>c)
            System.out.println("B is greatest");
            else 
            System.out.println("C is greatest");
         input.close();
        }
    }

