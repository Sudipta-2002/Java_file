import java.util.Random;
public class random_number {
    public static void main(String arg[])
    {
        Random obj=new Random();
        // int x=obj.nextInt();  /*take any random number posetive or negative */
        // int x=obj.nextInt(5); /*take random number 0 to 4 bound(5) means take 4*/
        // int x=obj.nextInt(6,10);/*random value take from 6-9 */
        boolean x=obj.nextBoolean(); /*TAKE RANDOM BOLLEAN */
        System.out.println(x);
    }

}
