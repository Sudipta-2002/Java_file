public class string_method {
    public static void main(String arg[])
    {
        String name="sudipta";  
/*equals(object) method check the name is equal or not*/

        // boolean result=name.equals("sudipta"); 

/*equalsIgnorecase(object) method ignore the lowe case or upper case letter only check object equality */

        // boolean result=name.equalsIgnoreCase("SUDIPTA");

/*length() method calculate the string length */

        // int result=name.length();

/*cahrAt(index number) print the index value*/
        
        // char result=name.charAt(2);

/*indexof("char") print this cahr index number*/
      
        // int result=name.indexOf("d");

/*isEmpty() check the string is empty or not */

        // boolean result=name.isEmpty();

/*toUpperCase() convert to upercase letter */
    
        // String result=name.toUpperCase();

/*toLowerCase() convert to upercase letter */
    
        // String result=name.toLowerCase();

/*replace(old char,new char) repace the string char */
   
        String result=name.replace("d", "g");

        System.out.println(result);
    }
}
