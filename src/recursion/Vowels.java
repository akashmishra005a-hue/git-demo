package recursion;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character");
        char ch = sc.next().charAt(0);
        if (ch >= 65 && ch <= 90|| ch >= 97 && ch <= 122) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("yes it is vowel ");
            } else {
                System.out.println("consonant");
            }
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("this is number ");
        } else {
            System.out.println("special character ");
        }
    }
}



