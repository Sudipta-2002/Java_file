// import java.util.Scanner;
// public class while_loop {
//     public static void main(String arg[])
//     {
//         Scanner input=new Scanner(System.in);
//         String name="";
//         while(name.isBlank())
//         {
//             System.out.println("Enter your name: ");
//             name=input.nextLine();
//         }
//         System.out.println("Hello "+name);
//     }
// }




public class while_loop {
 
    public static void main(String[] args) {
        //number
        int n = 20;
         
        //print all even numbers <=n 
        int i=1;
        while (i<=n) {
            if(i%2==0)
            
            System.out.print(i+"  ");
            i++;
            
        }
    }
}


