import java.util.Scanner;
public class calculator {
    public static void main(String arg[])
    {
      System.out.println("1 addition\n 2 subtraction");
      Scanner input=new Scanner(System.in);

        System.out.println("Enter the choice: ");
        int choice=input.nextInt();
        switch(choice){
        case 1: System.out.println("Enter the first value: ");
                int a=input.nextInt();
                System.out.println("Enter the second value: ");
                int b=input.nextInt();
                int c=a+b;
                System.out.println("Ans: "+c);
        break;
        case 2: System.out.println("Enter the first value: ");
                int x=input.nextInt();
                System.out.println("Enter the second value: ");
                int y=input.nextInt();
                int z=x-y;
                System.out.println("Ans: "+z);
        break;
        default: System.out.println("please press correct choice");
        }
        input.close();
    }
}
