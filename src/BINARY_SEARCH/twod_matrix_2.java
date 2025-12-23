package BINARY_SEARCH;

public class twod_matrix_2 {
    static boolean search(int[][]arr,int target){
        int n,m;
        n = 0;
        int []ans = {-1};
        m = arr[n].length-1;
        while(n<arr.length && m>=0){
            if(target==arr[n][m]) return true;
            else if(target>arr[n][m]) n++;
            else{
                m--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(search(arr,5));


    }
}
