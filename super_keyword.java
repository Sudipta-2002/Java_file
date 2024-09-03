class room{
    int length,bredth;
    room(int x,int y){
        length=x;
        bredth=y;

    }
    int area()
    {
        System.out.println(length);
        return (length*bredth);

       
    }

}
class bedroom extends room{
    int height;
    bedroom(int x,int y,int z){
        super(x,y);
        height=z;

    }
    int volume(){
        return (length*bredth*height);
    }

}
public class super_keyword {
    public static void main(String a[])
    {
        int Total_volume,Total_area;
        bedroom obj = new bedroom(10,20,30);
        room obj2 = new room(10,12);
        Total_volume=obj.volume();
        Total_area=obj.area();
        System.out.println("vloume: "+Total_volume);
        System.out.println("Area: "+Total_area);
        System.out.println(obj2.area());
        


    }
    
}



