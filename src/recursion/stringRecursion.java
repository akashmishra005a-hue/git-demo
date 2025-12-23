package recursion;
import java.util.*;
public class stringRecursion{
    public static String removeAlaphabet(String str,int idx){
        if(idx ==str.length()) return "";
        String smallAns = removeAlaphabet(str,idx+1);
        char current = str.charAt(idx);
        if(current!='a'){
            return current+smallAns;
        }
        return smallAns;
    }
    public static String stringReverse(String str,int idx){
        if(idx==str.length()) return "";

        String smallans  = stringReverse(str,idx+1);
        char current = str.charAt(idx);
        return smallans+current;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string ");
        String str = "";
        try{
             str = sc.nextLine();
        } catch(Exception e){
            System.out.println("charcter string");
        }
      System.out.println(removeAlaphabet(str,0));
      System.out.println(stringReverse(str,0));
    }
}

