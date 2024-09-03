import java.util.Scanner;
public class switch_case {
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter any day: ");
        String day=input.nextLine();
        switch(day){
            case "Sunday":System.out.println("it is sunday");
            break;
            case "Monday":System.out.println("it is Monday");
            break;
            case "Tuesday":System.out.println("it is Tuesday");
            break;
            case "Thusday":System.out.println("it is Thusday");
            break;
            case "Friday":System.out.println("it is Friday");
            break;
            case "Saturday":System.out.println("it is Saturday");
            break;
            default: System.out.println("Enter the correct data");
            
        }
        input.close();
    }
}
