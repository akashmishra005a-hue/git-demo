package Practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonaciSeries {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter any number ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int n = (bf.read()-48);
        int a = 0,b = 1;
        for(int i =1;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }

    }
}
