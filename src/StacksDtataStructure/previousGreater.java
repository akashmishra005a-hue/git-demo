package StacksDtataStructure;

import java.util.Stack;

public class previousGreater {
    public static int[] prevGreater(int[]arr)
    {
        int n =  arr.length;
        int[]res = new int[n];
        Stack<Integer>st = new Stack<Integer>();
        res[0] =-1;
        st.push(arr[0]);
        for(int i = 1;i<n;i++)
        {
            while(st.size()!=0&&st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i] =-1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr = {100,80,60,70,75,85};
        int[]prevgrt = prevGreater(arr);
        for(int a : prevgrt) System.out.print(a+" ");
    }
}
