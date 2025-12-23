package recursion;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        int count = 1;
        int a = 4;

            do {
                System.out.println("enter any number 1 to 10");
                b = sc.nextInt();
                count++;
                if(b==a)  {
                    System.out.println("win");
                    return;
                }

            }
            while (count<=3);
            System.out.println("maxed attempt");


    }

}
