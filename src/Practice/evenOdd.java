package Practice;
import java.util.Scanner;
public class evenOdd {
    public static boolean check(int n)
    {
        int a = n/2;
        if(a*2==n) return true;
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter any number ");
        int n = sc.nextInt();
        if(check(n)) System.out.println("Even number");
        else{
            System.out.println("odd number ");
        }

    }
}
