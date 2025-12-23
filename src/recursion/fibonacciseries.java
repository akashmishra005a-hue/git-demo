package recursion;
import java.util.Scanner;
public class fibonacciseries {
    static int  findterm(int n ){
        if(n==0||n==1){
            return n;
        }
        return findterm(n-1)+findterm(n-2);
    }
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter any number ");
//        int n = sc.nextInt();
//        for(int i=0;i<=n;i++) {
//            System.out.print(findterm(i)+" ");
//        }
        System.out.println(findterm(5));

    }

}
