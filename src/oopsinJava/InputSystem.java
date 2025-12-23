package oopsinJava;

import java.io.*;

public class InputSystem {
    public static void main(String[] args) throws Exception {
        int a;
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try{
            a = Integer.parseInt(bf.readLine());
        }
        finally{
            bf.close();
        }
        System.out.println(a);
    }

}
