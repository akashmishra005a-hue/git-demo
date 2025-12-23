package StacksDtataStructure;
import java.util.Stack;
public class consecutiveSubSequencs {
    public static int[] remove(int[]arr)
    {
        Stack<Integer>st = new Stack<>();
        for(int i =0;i<arr.length;i++)
        {
            if(st.size()==0||arr[i]!=st.peek()) st.push(arr[i]);
            else{
                if(i==arr.length-1||arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[]rest = new int[st.size()];
        for(int i = rest.length-1;i>=0;i--){
            rest[i] = st.pop();
        }
        return rest;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,2,3,4,4,4,5,6,6,6,7,7,1};
        int [] res = remove(arr);
        for(int a : res) System.out.print(a+" ");
    }
}
