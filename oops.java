// class reactangle{
//     int length,width;
//     void getdata(int x,int y)
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

// public class oops {
    
//     public static void main(String arg[])
//     {
//         int total;
//         reactangle rect1=new reactangle();
//         //reactangle rect2=new reactangle();
//         rect1.getdata(10,5);
//         total=rect1.area();
//         System.out.println("Area is: "+total);


//     }
// }





// class reactangle{
//     int length,width;
//     void getdata(int x,int y)
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

// public class oops {
    
//     public static void main(String arg[])
//     {
//         int total;
        
//         reactangle rect1=new reactangle();
//         rect1.length=10;
//         rect1.width=4;
//         total=rect1.area();
//         System.out.println("Area is: "+total);


//     }
// }




class reactangle{
    int length,width;
    void getdata(int x,int y)
    {
        length=x;
        width=y;
    }
    int area()
    {   
        int result;
        result=length*width;
        return result;
    }
}

public class oops {
    
    public static void main(String arg[])
    {
        
        int a;
        reactangle rect1=new reactangle();
        
        rect1.length=10;
        rect1.width=4;
        a=rect1.length*rect1.width;
        
        System.out.println("Area is: "+a);


    }

}