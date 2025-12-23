package recursion;

import java.util.ArrayList;

public class Sumofdigits {
//    static int sum(int n){
//        if(n>=0&&n<=9) return n;
//        int smallans = sum(n/10);
//        int lastdigit = n%10;
//        return smallans+lastdigit;
    static int count(int n){
        if(n>=0&&n<=9) return 1;
        return count(n/10)+1;
    }

    public static void main(String[] args)
    {
//        System.out.println(count(123454));

//    }

    }
}
