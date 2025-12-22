package StacksDtataStructure;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Stack;

public class Basics {
    public static void InsertAtbottom(int val,Stack<Integer>st)
    {
        Stack<Integer>gt = new Stack<>();
        while(st.size()>0) gt.push(st.pop());
        st.push(val);
        while(gt.size()>0) st.push(gt.pop());
    }
    public static void  reverseOrderofStack(Stack<Integer>st)
    {
        if(st.size()==0) return;
        int a = st.pop();;
        reverseOrderofStack(st);
        InsertAtbottom(a,st);
    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
      for(int i =1;i<=5;i++){
          st.push(i);

      }
        System.out.println(st);
       reverseOrderofStack(st);
        System.out.println(st);

    }
}
