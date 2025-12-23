package recursion;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.ArrayList;
public class SubSequence {
//   public static ArrayList<String> getssQ(String s) {
//        ArrayList<String> ans = new ArrayList<>();
//        if (s.length() == 0) {
//            ans.add("");
//            return ans;
//        }
//        char current = s.charAt(0);
//        ArrayList <String> smallans = getssQ(s.substring(1));
//        for(String ss :smallans) {
//            ans.add(ss);
//            ans.add(ss + current);
//        }
//        return ans;
//    }
    public static void printSssQ(String s, String currentans){
        if(s.length()==0){
            System.out.println(currentans);
            return;
        }
        char c = s.charAt(0);
        String remaining = s.substring(1);
        printSssQ(remaining,currentans+c);
        printSssQ(remaining,currentans);
    }

    public static void main(String[] args) {
//        ArrayList<String> ss = getssQ("abc");
//        for(String s:ss){
//            System.out.println(s);
//        }
printSssQ("abc","");
    }
}
