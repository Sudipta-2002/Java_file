// import java.util.Scanner;      //Matrix
// public class two_d_array {
//     public static void main(String arg[])
//     {   int row,column;
//         int arr[][]=new int[10][10];
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the size of row: ");
//         row=input.nextInt();
//         System.out.println("Enter the size of column: ");
//         column=input.nextInt();
//         System.out.println("Enter the matrix element: ");
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<column;j++)
//             {
//                 arr[i][j]=input.nextInt();
//             }
          
//         }
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<column;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
            
//           System.out.println();
//         }
//         input.close();
//     }
// }





//another process to intialize 2d matrix

public class two_d_array {
     public static void main(String arg[])
     {
        int arr[][]={
                      {1,2,3},
                      {4,5,6},
                      {7,8,9},
                    };
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            
          System.out.println();
        }

     }

}