package BINARY_SEARCH;

public class srch_FrstOcuurence {
    static int findFirstIndex(int[]arr,int x,int i,int j){
        int val = -1;
        if(i>j) return val;
        int mid = i+(j-i)/2;
        if(x<arr[mid]){
            return findFirstIndex(arr,x,0,mid-1);
        }
        else if(x>arr[mid]) return findFirstIndex(arr,x,mid+1,j);
        else{
            val = mid;
          j = mid-1;
          return findFirstIndex(arr,x,i,j);
        }
    }
    static int searchfirstOcuurence(int[]arr,int x,int start,int end){
        int val = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(x<arr[mid]){
                end = mid-1;
            }
            else if(x>arr[mid]) start = mid+1;
            else{
                val = mid;
                end = mid-1;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,2,3,4,4,5,5};
        int x = 2;
        System.out.println(searchfirstOcuurence(arr,x,0,arr.length-1));
//        System.out.println(findFirstIndex(arr,x,0,arr.length-1));
    }
}
