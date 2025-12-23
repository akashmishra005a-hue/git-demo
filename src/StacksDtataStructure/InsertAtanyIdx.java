package StacksDtataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InsertAtanyIdx  {

    public static void main(String[] args) throws Exception {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf  = new BufferedReader(i);
        Stack<Integer>st = new Stack<>();
        System.out.println("Enter the size of stack");
        int s = Integer.parseInt(bf.readLine());
        System.out.println("Enter the"+s+" elemnt ");
        for(int j =1;j<=s;j++) {
            int x = Integer.parseInt(bf.readLine());
            st.push(x);
        }
        Stack<Integer>rt = new Stack<>();
        System.out.println("enter the  index  you insert ");
        int idx = Integer.parseInt(bf.readLine());
        while(st.size()>idx-1){
            rt.push(st.pop());
        }
        System.out.println("enter the elemnt ");
        int n = Integer.parseInt(bf.readLine());
        rt.push(n);
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
