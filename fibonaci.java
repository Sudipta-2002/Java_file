public class fibonaci {
    public static void main(String arg[])
    {
        int a=1,b=1,range=5,sum=0;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        for(int i=1;i<=range-2;i++)
        {
        sum=a+b;
        a=b;
        b=sum;
        System.out.print(sum+"\t");
        }
    }
}
