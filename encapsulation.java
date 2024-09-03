class car{
    private String name;
    private int model_no;
    void show(String name,int model_no)
    {
        this.name=name;
        this.model_no=model_no;

    }
    public String getname()
    {
        return name;
    }
    public int getmodel()
    {
        return model_no;
    }
    
    
}
public class encapsulation {
    public static void main(String arg[])
    {
        car obj=new car();
        obj.show("bmw",120);
        System.out.println(obj.getname());
    }
    
}






// class car{
//     private String name;
//     private int model_no;
//     void show(String name,int model_no)
//     {
//         this.name=name;
//         this.model_no=model_no;

//     }
//     public String getname()
//     {
//         return name;
//     }
//     public int getmodel()
//     {
//         return model_no;
//     }
//     public void setname(String name)
//     {
//         this.name=name;
//     }
    
// }
// public class encapsulation {
//     public static void main(String arg[])
//     {
//         car obj=new car();
//         obj.show("bmw",120);
//         obj.setname("gita");
//         System.out.println(obj.getname());
//     }
    
// }
