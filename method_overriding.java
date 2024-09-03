class base{
    void display()
    {
        System.out.println("i am parent class");
    }

}

class child extends base{
    void display()
    {
        System.out.println("i am child class");
    }
}
public class method_overriding {
    public static void main(String arg[])
    {
        base objBase =new base();
        objBase.display();
        base objChild =new child();
        objChild.display();
    }  
}
