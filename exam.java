// public class exam {
//     exam(){
//         System.out.println("constructor");
//     }
//     void sum(int a,int b)
//     {
//         int result;
//         result=a+b;
//         System.out.println(result);
//     }
//     public static void main(String arg[]){

//         exam obj = new exam();
//         obj.sum(10,20);
        
//     }

// }




// Java program to demonstrate How Diamond Problem
// Is Handled in case of Default Methods

// Interface 1
// interface API {
// 	// Default method
// 	default void show()
// 	{

// 		// Print statement
// 		System.out.println("Default API");
// 	}
// }

// // Interface 2
// // Extending the above interface
// interface Interface1 extends API {
// }

// // Interface 3
// // Extending the above interface
// interface Interface2 extends API {
// }

// // Main class
// // Implementation class code
// class exam implements Interface1, Interface2 {
// 	// Main driver method
// 	public static void main(String args[])
// 	{
// 		// Creating object of this class
// 		// in main() method
// 		exam d = new exam();

// 		// Now calling the function defined in interface 1
// 		// from whom Interface 2and 3 are deriving
// 		d.show();
// 	}
// }











// interface Animal {
//   public void animalSound(); // interface method (does not have a body)
//   public void sleep(); // interface method (does not have a body)
// }

// // Pig "implements" the Animal interface
// class Pig implements Animal {
//   public void animalSound() {
//     // The body of animalSound() is provided here
//     System.out.println("The pig says: wee wee");
//   }
//   public void sleep() {
//     // The body of sleep() is provided here
//     System.out.println("Zzz");
//   }
// }

// class exam {
//   public static void main(String[] args) {
//     Pig myPig = new Pig();  // Create a Pig object
//     myPig.animalSound();
//     myPig.sleep();
//   }
// }








class exam{
    int result;
    void sum(int a,int b,int c){
        result=a+b+c;
        System.out.println(result);
    }
void sum(int a,int b){
        result=a+b;
        System.out.println(result);
    }

    public static void main(String arg[])
    {
        
        exam obj=new exam();
        obj.sum(10,20,30);
        obj.sum(10,30);

    }
}