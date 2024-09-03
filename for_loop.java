public class for_loop {
    public static void main(String arg[])
    {
        int num = 7;
        int flag=1; 
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            flag++; 
        }
        if(flag==1) 
           System.out.println("The number is prime");
        else
           System.out.println("The number is not prime");
    }
}
