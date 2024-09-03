// class no{
//     int num;
//     no(int num)
//     {
//         this.num=num;
//     }
// }



// public class array_object {
//     public static void main(String arg[])
//     {
//         no[] obj=new no[3];  //array declaration
//         no obj1=new no(1);
//         no obj2=new no(2);
//         no obj3=new no(3);

//         obj[0]=obj1;  //insert the object in the array
//         obj[1]=obj2;
//         obj[2]=obj3;

//         System.out.println(obj[0]); //print the address of the array
//         System.out.println(obj[0].num);   //print the value of the array
//         System.out.println(obj[1].num); 
//         System.out.println(obj[2].num); 
//         System.out.println(obj1.num);     
//     }  
// }




//ANOTHER WAY OF ARRAY OBJECT
class no{
    int num;
    no(int num)
    {
        this.num=num;
    }
}



public class array_object {
    public static void main(String arg[])
    {
        
        no obj1=new no(1);
        no obj2=new no(2);
        no obj3=new no(3);

        no[] obj={obj1,obj2,obj3};  //insert the object into the array

        System.out.println(obj[0]); //print the address of the array
        System.out.println(obj[0].num); 
        System.out.println(obj[1].num); 
        System.out.println(obj[2].num); 
        System.out.println(obj1.num);  //simple way print the value

        
    }
    
}

