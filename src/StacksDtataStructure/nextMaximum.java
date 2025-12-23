package StacksDtataStructure;

import java.util.Stack;

public class nextMaximum {
    public static int[] nextGreater(int[]arr)
    {
        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        int [] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i = n-2;i>=0;i--){
            while(st.size()!=0&&st.peek()<arr[i]){
                st.pop();
            }
            if (st.size()==0) res[i] = -1;
            else  {
                res[i] = st.peek();
            }

                 st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
//        int [] arr = {2,4,3,6,8,4,3};
//        int [] res  = nextGreater(arr);
//        for(int x : res) System.out.print(x+" ");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<5-i+1;j++){
                System.out.print("  " +
                        "");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
