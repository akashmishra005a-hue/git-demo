package BINARY_SEARCH;

public class AnswerValueBinarySearch {
    static boolean check(int[]arr,int kids,int mindstnc){
        int numkids = 1;
        int lastkid = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]-lastkid>=mindstnc){
                numkids++;
                lastkid = arr[i];
            }
        }
        return numkids>=kids;
    }
    static int MinMax(int[]arr,int k){
        int start =0,end = (int)Math.pow(2,10),ans = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(check(arr,k,mid)){
                ans = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,8,9};
        int k = 2;
        System.out.println(MinMax(arr,k));
    }
}
