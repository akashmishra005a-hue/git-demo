package Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean check(int n)
    {
        int check = 0;
        for(int i =1;i<n/2;i++)
        {
            if(n%i==0) check++;
        }
        if(check==1) return true;
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if(check(n)) System.out.println("prime number");
        else{
            System.out.println("not prime number");
        }

    }
}
