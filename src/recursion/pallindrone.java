package recursion;
import java.util.*;
public class pallindrone {
    public static String check(String s,int idx){
        if(idx==s.length()) return "";
       String smallans = check(s,idx+1);
       if(s.charAt(idx)==s.charAt(s.length()-(idx+1))){
           return "pallidrone";
        }
        return "notpallindrone";
    }
    public static boolean check(String s,int l,int r){
        if(l>=r) return true;
return s.charAt(l)==s.charAt(r) && check(s,l+1,r-1);
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
//String ans = check(str,0);
//    for(int i=0;i<ans.length();i++){
//        System.out.print(ans.charAt(i));
//    }
boolean bool = check(str,0,str.length()-1);
    if(bool){
        System.out.println("pallindrone");
    }
    else{
        System.out.println("not pallindrone");
    }
    }
}
