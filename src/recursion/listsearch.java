package recursion;
import java.util.*;
import java.util.ArrayList;
public class listsearch {
    public static ArrayList<Integer> search(int []arr, int target, int idx){
        if(idx==arr.length) return new ArrayList<Integer>();
       ArrayList<Integer>ans = new ArrayList();
        if(arr[idx]==target){
           ans.add(idx);
        }
        ArrayList<Integer>smallans = search(arr,target,idx+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the "+n+"element of array");
        int []arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value ");
        int target = sc.nextInt();
        ArrayList<Integer>ans= search(arr,target,0);
      for(Integer i:ans){
          System.out.println(i);
      }
    }
}
