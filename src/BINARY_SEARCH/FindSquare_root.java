package BINARY_SEARCH;

public class FindSquare_root {
    static int SqaareRoot(int x){
        int start,end;
        start = 0;
        end = x;
        int ans = -1;
        while(start<end){
            int mid = start+(end-start)/2;
            int val = mid*mid;
            if(x==val ) return mid;
            else if(val>x ){
              end = mid-1;
            }
          else {
              start = mid+1;
              ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 25;
        System.out.println(SqaareRoot(x));
    }
}
