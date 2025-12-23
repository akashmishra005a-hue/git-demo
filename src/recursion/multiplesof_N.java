package recursion;
import java.util.Scanner;
public class multiplesof_N {
    static void multiples(int n,int k){
//        if(k==0) return 0;
//        int a = multiples(n,k-1)+1;
//        int ans = n*a;
//        System.out.print(ans+" ");
//        return a;
        if(k ==0) {
            return;
        }
        multiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int n = sc.nextInt();
        System.out.println("enter the no of times multiple");
        int k = sc.nextInt();
        multiples(n,k);
    }
}
