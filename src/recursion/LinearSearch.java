package recursion;
import java.util.*;
public class LinearSearch {
    public static void findIndicies(int []arr,int target,int idx) {
        if (idx == arr.length) return;
        if(arr[idx]==target){
            System.out.println("index is "+idx);
        }
        findIndicies(arr,target,idx+1);

    }
    public static boolean search(int []arr,int idx,int target){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return true;
        return search(arr,idx+1,target);
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
       if(search(arr,0,target)){
           System.out.println("yyes");
       }
       else System.out.println("no");
//        findIndicies(arr,target,0);
    }

}