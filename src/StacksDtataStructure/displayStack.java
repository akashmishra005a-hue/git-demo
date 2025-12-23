package StacksDtataStructure;

import java.util.Scanner;
import java.util.Stack;
public class displayStack {
    public static void  displayRecv(Stack<Integer>st)
    {
        if(st.size()==0) return;
        int x = st.pop();
        displayRecv(st);
        System.out.print(x+" ");
        st.push(x);
    }
    public static void inserAtBottom(Stack<Integer>st,int b)
    {
        if(st.size()==0){
            st.push(b);
            return;
        }
                int a = st.pop();
                   inserAtBottom(st,b);
                   st.push(a);
    }
    public static void  revesreRecursively(Stack<Integer>rt)
    {
        if(rt.size()==1) return;
        int top = rt.pop();
        revesreRecursively(rt);
      inserAtBottom(rt,top);
    }
    public static void deleteAtidx(Stack<Integer>dt,int idx)
    {
        Stack<Integer>temp = new Stack<>();
     while(dt.size()>idx){
         temp.push(dt.pop());
             }

      dt.pop();
        while(temp.size()>0)
        {
            dt.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> t = new Stack<>();
        System.out.println("Enter the size of stack");
       int n = sc.nextInt();
        System.out.println("enter the "+n+"element");
        while(n>0){
            int x = sc.nextInt();
            t.push(x);
            n--;
        }
        displayRecv(t);
        deleteAtidx(t,3);
        System.out.println();
        displayRecv(t);
    }
}
