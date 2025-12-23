package oopsinJava;
import java.util.Scanner;
public class Exception_Hnadling {
    public static int divide(int a,int b) throws Exception{
     try {
         return a / b;
     } catch(Exception w){
         return-1;
        }
    }
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
         divide(2,0);
//        System.out.println("enter any number ");
//        int a;
//        try {
//            a = sc.nextInt();
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("print integer value");
//        }
//     int[]arr = {1,2,3,4};
//     for(int i =0;i<10;i++){
//         try {
//             System.out.print(arr[i] + " ");
//         } catch (Exception e) {
//             System.out.println("bhai place nahi hai store karne ke liye");
//         }
//     }

    }
}