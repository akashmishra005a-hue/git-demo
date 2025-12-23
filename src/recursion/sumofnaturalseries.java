package recursion;
import java.util.Scanner;
public class sumofnaturalseries {
    public static int sum(int n){
        if(n==0) return 0;
        return sum(n-1)+n;
    }
    public static int seriesSum(int n){
        if(n==0) return 0;
        if(n%2==0){
            return seriesSum(n-1)-n;
        }
        return seriesSum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int n  = sc.nextInt();
        System.out.println("sum is "+sum( n));
        System.out.println("sum of alterante series is "+ seriesSum(n));

    }
}
