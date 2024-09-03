import java.util.Scanner;
public class user_input {
    public static void main(String arg[])
    {
        System.out.println("Enter your name: ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("My name is: "+name);
        input.close();
    }
}
