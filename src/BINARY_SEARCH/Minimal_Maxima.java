package BINARY_SEARCH;

public class Minimal_Maxima {
    static boolean checkdivision(int[]arr,int maximumchlt,int m){
        int numstudent = 1;
        int cureentchoclate = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maximumchlt) return false;
            if(cureentchoclate+arr[i]<=maximumchlt){
                cureentchoclate +=arr[i];
            }
            else{
                numstudent++;
                cureentchoclate = arr[i];
            }
        }
        return numstudent<=m;
    }
    static int MaxMinChoclate(int[]arr,int m){
        int start = 1,ans = 0;
        int end = 15;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(checkdivision(arr,mid,m)) {
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {5,3,1,4,2};
        int m = 3;
        System.out.println("maximum minima is "+MaxMinChoclate(arr,m));
    }
}
