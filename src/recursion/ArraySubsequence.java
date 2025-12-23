package recursion;
import java.util.*;
public class ArraySubsequence {
    public static void subsset(int[]arr,int idx ,int n,int sum)
    {
        if(idx==n) {
            System.out.print(sum+" ");
            return;
        }
        subsset(arr,idx+1,n,sum+arr[idx]);
        subsset(arr,idx+1,n,sum);

    }
    public static void main(String[] args) {
        int[]arr = {2,4,5};
        subsset(arr,0,arr.length,0);

    }
}
