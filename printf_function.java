public class printf_function {
    public static void main(String arg[])
    {
        boolean a=true;
        char b='@';
        int c=10;
        String d="sudipta";
        double e=20.1;
        System.out.printf("%d\n",c);
        System.out.printf("%c\n",b);
        System.out.printf("%b\n",a);
        System.out.printf("hello %10s\n",d); 

        //%10s menas 10 space between the two string 
        System.out.printf("%.3f\n",e);

    }
    
}
