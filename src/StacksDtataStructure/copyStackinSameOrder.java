package StacksDtataStructure;

import java.util.Scanner;
import java.util.Stack;

public class copyStackinSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>st = new Stack<>();
        System.out.println("enter the element that you want to insert in stack");
        int n = sc.nextInt();
        System.out.println("enter the "+n +" "+"element");
        for(int i =1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    Stack<Integer>rt = new Stack<>();
    while(st.size()>0){
        rt.push(st.pop());
    }
    while(rt.size()>0){
        st.push(rt.pop());
    }
        System.out.println(st);
    }
}
