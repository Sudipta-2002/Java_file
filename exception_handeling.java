//Artithmetic Exeception  
// public class exception_handeling {
//     public static void main(String arg[])
//     {
//         int a=5;
//         int b=0;
//         try{
//         int c=a/b;   //exception here
//         System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println("This code occuers Arithmetic exception");
//             System.out.println(e);
//         }

//     }
    
// }






//Array index out of bound exception
// import java.util.Scanner;
// public class exception_handeling {
//     public static void main(String arg[])
//     {
//         int a[]=new int [3];
//         a[0]=1;
//         a[1]=2;
//         a[2]=3;
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the array index");
//         int ind=input.nextInt();
//         System.out.println("Enter value of array index devided");
//         int val=input.nextInt();
//         try{
//             System.out.println("The value of array index enterd is: " + a[ind]);
//             System.out.println("The value of array-value/val: " + a[ind]/val);
//         }
//         catch(Exception e){
//             System.out.println("some exception occured");
//             System.out.println(e);

//         }
//         input.close();


//     }
// }







//specific exception handel OR MULTIPLE CATCH BLOCK

// import java.util.Scanner;
// public class exception_handeling {
//     public static void main(String arg[])
//     {
//         int a[]=new int [3];
//         a[0]=1;
//         a[1]=2;
//         a[2]=3;
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the array index");
//         int ind=input.nextInt();
//         System.out.println("Enter value of array index devided");
//         int val=input.nextInt();
//         try{
//             System.out.println("The value of array index enterd is: " + a[ind]);
//             System.out.println("The value of array-value/val: " + a[ind]/val);
//         }
//         catch(ArithmeticException e){
//             System.out.println("ArithmeticException occured");
//             System.out.println(e);

//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("ArrayIndexOutOfBoundsException occured");
//             System.out.println(e);

//         }
//         catch(Exception e){
//             System.out.println("some exception occured");
//             System.out.println(e);
//         }

//         input.close();
//     }
// }






//NESTED TRY CATCH
//example 1:-

// public class exception_handeling {
//     public static void main(String arg[])
//     {
//         int a[]=new int [3];
//         a[0]=1;
//         a[1]=2;
//         a[2]=3;
//         try{
//             System.out.println(a[1]);
//             try{
//                 System.out.println(a[10]);
//             }
//             catch(Exception e){
//                 System.out.println("Exception occuer in level 2");
//             }  
//         }
//         catch(Exception e){
//             System.out.println("Exception occure in level 1");

//         }
//     }
// }

  

//note:when the first try block has no exception then go to the second try block otherwise excute the program
//example 2:-

// public class exception_handeling {
//     public static void main(String arg[])
//     {
//         try{
//             int a=2,b=4,c=2,x=7,z;
//             int p[]={2};
//             p[3]=33;
//             try{
//                 z=x/((b*b)-(4*a*c));
//                 System.out.println("The value of z is: " +z);

//             }
//             catch(ArithmeticException e){
//                 System.out.println("ArithmeticException");

//             }
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index out of bound");
//         }

//     }
// } 






//using throw 

// import java.lang.Exception;
// class MyException extends Exception{
//     MyException(String message)
//     {
//       super(message);
        
//     }

// }
// public class exception_handeling {
//     public static void main(String arg[])
//     {
//         int x=5,y=100;
//         try{
//             float z= y / x;
//             System.out.println(z);
//             if(z>0.01)
//             {
//                 throw new MyException("NUMBER IS TO SMALL");

//             }
//         }
//         catch(MyException e){
//             System.out.println("Exception");
//             System.out.println(e.getMessage());
//         }
//     }
// }






// public class exception_handeling {
//     public static void main(String arg[])
//     {
//         int a=6;
//         int b=2;
//         try{
//         int c=a/b;   //exception here
//         System.out.println(c);
//         if(c>1)
//         throw new Exception("The number is to small");
//         }
//         catch(Exception e){
            
//             System.out.println(e.getMessage());
//         }

//     }
    
// }






//using throws keyword
public class exception_handeling {
    public static int divided(int a, int b) throws ArithmeticException
    {
        int result=a/b;
        return result;

    }
    public static void main(String arg[])
    {
        try{
        int c= divided(5, 0);
        System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("caught exception "+e);
        }
    }
}






// public class exception_handeling {
//     public static void fun()
//     {
//         try{
//             throw new ArrayIndexOutOfBoundsException();
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("ytgfshuiscdytigfaze");
//             //System.out.println(e.getMessag());


//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("ttttttttttt");
//         }
//         //final block output is always last
//         finally{
//             System.out.println("I am always here");
//         }
//     }
//     public static void main(String arg[])
//     {
//         fun();
//     }
// }