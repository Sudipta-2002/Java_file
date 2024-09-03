class a{
    String name;
    int age;
    void this_key(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

public class this_keyword {
    public static void main(String arg[])
    {
    a obj=new a();
    obj.this_key("sudipta",20);
    System.out.println(obj.name);
    System.out.println(obj.age);
    }
    
}

//this keyword refers to the current object in a method or constructor

//this keyword is use to eliminate the confusion between class atribute and parameters with same name
