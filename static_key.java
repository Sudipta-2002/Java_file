class keyword{
    static int mul(int a,int b)  
        {
            return a*b;
        }
    static int div(int a,int b)
        {
            return a/b;           
        }
}
public class static_key {
    public static void main(String arg[])
    {
        float x=keyword.mul(10,2);
        float y=keyword.div(10,2);
        System.out.println("Mul: "+x);
        System.out.println("Div: "+y);
    }
    
}
