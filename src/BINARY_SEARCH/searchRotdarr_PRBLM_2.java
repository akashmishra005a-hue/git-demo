package BINARY_SEARCH;

public class searchRotdarr_PRBLM_2 {
    static int searchtarget(int[]arr,int target) {
        int start,end;
        start = 0;
        end = arr.length-1;
        while(start <=end) {
            int mid = start + (end - start) / 2;
            while(start<end&&arr[start]==arr[mid]&&arr[mid]==arr[end]){
                start++;
                end--;
            }
            if(arr[mid]==target) return mid;
            else if(arr[mid]<arr[end]){
                if(target>arr[mid]&&target<=arr[end]) start = mid+1;
                else end = mid-1;
            }
            else{
                if(target>=arr[start]&&target<arr[mid])  end = mid-1;
                else start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[]arr = {3,5,1};
        int target = 3;
        System.out.println(searchtarget(arr,target));
    }
}
