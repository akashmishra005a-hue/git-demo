package BINARY_SEARCH;

public class searchRoatetdarray_problem_1 {
    static int  minvalue(int[]arr){
     int n = arr.length;
     int start = 0;
     int end = n-1;
     int ans = -1;
     while(start<=end){
         int mid = start + (end-start)/2;
         if(arr[mid]>arr[n-1]){
             start = mid+1;
         }
         else{
             end = mid-1;
             ans = mid;
         }
     }
     return ans;
    }
    public static void main(String[] args) {
        int[]arr = {5,6,7,8,9,10,1,2,3,4};
        System.out.println("minimum index is "+minvalue(arr));
    }
}
