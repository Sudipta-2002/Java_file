abstract class animal{
    abstract void sound();
    void sleep()
    {
        System.out.println("zzzzzzzz");
    }
    
}
class pig extends animal{
    void sound()
    {
        System.out.println("ahaaaaa");
    }
}
public class abstraction {
    public static void main(String arg[])
    {
        pig obj=new pig();
        obj.sound();
        obj.sleep();
    }
    
}
