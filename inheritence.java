class super_class{
    int a=10,b=5;
    void sum(){
        System.out.println(a+b);
    }

}


class sub_class extends super_class{
    void mul(){
        System.out.println(a*b);
    }

}


public class inheritence {
    public static void main(String arg[])
    {
    super_class obj1=new super_class();
    sub_class obj2=new sub_class();
    obj1.sum();
    obj2.mul();
    obj2.sum(); //print the sum because sub_class is inherit all the method and data from the parent class
    } 
}
