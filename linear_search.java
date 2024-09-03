import java.util.Scanner;
public class linear_search {
    public static void main(String arg[])
    {
        int arr[]={12,13,45,67,34};
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=myobj.nextInt();
        for(int i=0;i<5;i++)
        {
        if(num == arr[i])
        {
        System.out.println("The input number is present in array position:"+i);
        break;
        }
        else{
        System.out.println("The input number is not present in array position:"+i);
        
        }
        }
        myobj.close();
    }
}