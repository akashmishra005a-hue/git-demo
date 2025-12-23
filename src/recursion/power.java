package recursion;
import java.util.Scanner;
public class power {
//    static int Power(int a,int b){
//        if(b==0) return 1;
//        try {
//            return a*Power(a,b-1);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    public static int Power(int a,int b){
        if(b==0) return 1;
        int smallans = Power(a,b/2);
        if(b%2==0){
            return smallans*smallans;
        }
        return a*smallans*smallans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = sc.nextInt();
        System.out.println("ENTER the power ");
        int b = sc.nextInt();
        System.out.println(Power(a,b));
    }

}
