public class math_function {
    public static void main(String arg[])
    {
        double a=10.21;
        double b=30;
        double c;
        // int c= Math.max(a,b);  /*calculate the max */
        // c=Math.min(a, b);    /*CALCULATE MIN */
        // c=Math.sqrt(a);     /*calculate the sqrt value */
        // c=Math.abs(a);    /*calculate the absolute value */
        // c=Math.floor(a);    /*floor value means 10.10=10.0 */
        // c=Math.ceil(a);     /*ceil value means 10.51=11.0 */
        c=Math.sqrt((a*a)+(b*b));  /*calculate triangle hypotenuse*/
        System.out.println(c);
    }
}
