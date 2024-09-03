//useing only base class

// public class method_overloading {
//         public static void main(String arg[])
//         {
//             int a=10,b=20,c=30,z;
//             z=sum(a,b,c);
//             System.out.println("Ans: "+z);
//         }
//          static int sum(int a,int b)  
//         {
//             System.out.println("This is overloaded 1");
//             return a+b;
//         }
//         static int sum(int a,int b,int c)
//         {
//             System.out.println("This is overloaded 2");
//             return a+b+c;
           
//         }
//     }


//using different class

// class  overload{
//     int sum(int a,int b,int c)
//     {
//         System.out.println("This is overloaded 2");
//         return a+b+c;
           
//     }
//     int sum(int a,int b)
//     {
//         System.out.println("This is overloaded 1");
//         return a+b;

//     }      

// }

// public class method_overloading {
//         public static void main(String arg[])
//         {
//             int a=10,b=20,c=30,z;
//             overload obj= new overload();
//             z=obj.sum(a,b,c);
//             System.out.println("Ans: "+z);
//         }      
//     }




//using consturctor

class  sum{
    int x,y;
    sum(int a,int b)
    {
        x=a;
        y=b;
        System.out.println("This is overloaded 2");
        
        
           
    }
    sum(int a)
    {
        y=x=a;

        System.out.println("This is overloaded 1");
        
    }   
    int total()
    {
        return x+y;
    }  

}

public class method_overloading {
        public static void main(String arg[])
        {
            int a=10,b=20,result;
            sum obj= new sum(a,b); 
            result=obj.total();
            System.out.println(result);
                     
        }
              
        
    }



