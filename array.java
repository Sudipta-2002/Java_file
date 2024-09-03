import java.util.Scanner;
public class array {
    public static void main(String arg[])
    { 
        // int arr[]={1,2,3,4,5};
        // String arr[]={"a","b","c","d","e"};
        int arr[]=new int[100]; //array declaration
        int size;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        size=input.nextInt();
        System.out.println("Enter the array element: ");
        for(int i=0;i<size;i++)

            arr[i]=input.nextInt();

        System.out.println("The array element is: ");

        for(int i=0;i<size;i++)

            System.out.print(arr[i]+" ");
        
     input.close();
    }
}
