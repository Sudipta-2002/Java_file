public class find_greatest_among_array {
    public static void main(String arg[])
    {
        int arr[]={12,13,45,67,34},max=arr[0];
        for(int i=0;i<5;i++)
        {
        if(max<arr[i])
        max=arr[i];
        }
        System.out.println("Larger number of array is:"+max);
    }
}
