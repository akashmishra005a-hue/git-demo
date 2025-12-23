package BINARY_SEARCH;

public class Fandl_Ocuurence {
    static int[] search(int[]arr,int target){
        int start,end;
        int n = arr.length;
        int i = 0;
        start = 0;
        int []ans = {-1,-1};
        int a = ans.length-1;
        end = arr.length-1;
        if(n==1){
            if(arr[start]==target){
                ans[i++] = start;
                ans[i++] = end;
                return ans;
            }
            else return ans;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]) end = mid-1;
            else if(target>arr[mid]) start = mid+1;
            else{
                ans[i++] = mid;
                end = mid-1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {1,1,2,3};
        int target = 1;
        int[]ans = search(arr,target);
        for(int x : ans){
            System.out.print(x+" ");
        }
    }
}
