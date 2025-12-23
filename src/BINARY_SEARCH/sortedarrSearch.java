package BINARY_SEARCH;
import java.util.Scanner;
public class sortedarrSearch {
    static void dispaly(int[]arr){
        for(int x : arr) System.out.print(x+" ");
        System.out.println();
    }
    static boolean search(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start = mid+1;
            }

            else if(target<arr[mid]){
                end = mid-1;
            }
            else return true;
        }
        return false;
    }
    static boolean recursiveSearch(int[]arr,int target,int start,int end){
        if(start>end) return false;
        int mid = start + (end-start)/2;
        if(target ==arr[mid] ) return true;
        else if(target>arr[mid]){
     return recursiveSearch(arr,target,mid+1,end);
        }
        else {
         return recursiveSearch(arr,target,start,mid-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter the "+n+"element of sorted array ");
        for(int i= 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value");
        int target = sc.nextInt();
        System.out.println("array is ");
        dispaly(arr);
        System.out.println(search(arr,target,0,arr.length-1));
        System.out.println(recursiveSearch(arr,target,0,arr.length-1));
    }
}
