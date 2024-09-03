// import java.util.Scanner;
// class b {
//     int a,b;
//     int sum1(int a,int b)
//     {
        
//         return a+b;
//     } 
// }
// public class oops_in_user_input{
//     public static void main(String arg[])
//     {
//         int result;
//         b obj=new b();
//         Scanner inp=new Scanner(System.in);
//         int x=obj.a=inp.nextInt();
//         int y=obj.b=inp.nextInt();
//         result=obj.sum1(x,y);
//         System.out.println(result);
//         inp.close();

//     }
// }





// import java.util.Scanner;
// class b {
//     int a,b;
//     int sum1()
//     {
        
//         return a+b;
//     } 
// }
// public class oops_in_user_input{
//     public static void main(String arg[])
//     {
//         int result;
//         b obj=new b();
//         Scanner inp=new Scanner(System.in);
//         obj.a=inp.nextInt();
//         obj.b=inp.nextInt();
//         result=obj.sum1();
//         System.out.println(result);
//         inp.close();

//     }
// }




class b {
    
    int sum1()
    {
        int a=10;
        int b=20;
        return a+b;
    } 
}
public class oops_in_user_input{
    public static void main(String arg[])
    {
        int result;
        b obj=new b();
        result=obj.sum1();
        System.out.println(result);

    }
}
