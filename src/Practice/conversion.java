package Practice;
import Linked_List.*;
import java.util.Scanner;
public class conversion {
         static void print(int a,int b){
            System.out.println(a+b);
        }
        static int print(int a,int b,int c){
            return a+b+c;
        }
    public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//       String[]str = {"akash","aman"};
//      String s1 = str[0];
//      int a =0;
//       for(int i=0;i<s1.length();i++){
//           char ch = s1.charAt(i);
//           System.out.println(ch);
//           a+=5;
//       }
//        System.out.println(a);
        int a = 4;
        int b = 7;
        a = (b-a++);
        System.out.println(a);
    }
}
