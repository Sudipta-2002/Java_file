//perametrized consturctor

// class rectangle{
//      int length,width;
//     rectangle(int x,int y)
//     {
       
//         length=x;
//         width=y;
//     }
//     int area()
//     {
//         int result;
//         result=length*width;
//         return result;
//     }
// }

// public class constuctor {
//     public static void main(String arg[])

//     {
//         rectangle rect1=new rectangle(10,5);
//         int total=rect1.area();
//         System.out.println("Area is: "+total);
//     }
    
// }



//default constuctor

class rectangle{
     int length,width;
    rectangle()
    {
       
        length=10;
        width=10;
    }
    int area()
    {
        int result;
        result=length*width;
        return result;
    }
}

public class constuctor {
    public static void main(String arg[])

    {
        rectangle rect1=new rectangle();
        int total=rect1.area();
        System.out.println("Area is: "+total);
    }
    
}
