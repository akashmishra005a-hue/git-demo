package recursion;
import java.util.Scanner;
public class gcd {
    public static int highestfactor(int x,int y){
        if(y==0) return x;
        return highestfactor(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr 1 number ");
        int x = sc.nextInt();
        System.out.println("enter 2 number ");
        int y = sc.nextInt();
        System.out.println("highesr common factor is "+highestfactor(x,y));
    }
}
