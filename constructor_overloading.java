class name{
    String a;
    String b;
    String c;
     name(String a,String b)
    {
        this.a=a;
        this.b=b;
    }
    name(String a,String b,String c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void print_fn()
    {
        System.out.println("First: "+a);
        System.out.println("Second: "+b);
        System.out.println("Third: "+c);

    }
}
public class constructor_overloading {
    public static void main(String arg[])
    {
        name obj =new name("sudipta","sujit");
        
        // System.out.println("First: "+obj.a);
        // System.out.println("Second: "+obj.b);
        // System.out.println("Third: "+obj.c);
        obj.print_fn();
        
    }
}
