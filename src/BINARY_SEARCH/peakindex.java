package BINARY_SEARCH;

public class peakindex{
    static int findPeakValue(int[]arr){
        int start,end;
        start = 0;
        end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                ans = mid+1;
            start = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
    int[]arr = {0,1,2,3,4,6,5,4,3,2,1};
        System.out.print("peak index is "+findPeakValue(arr));
}
}
