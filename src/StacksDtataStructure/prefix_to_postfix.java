package StacksDtataStructure;

import java.util.Stack;

public class prefix_to_postfix {
    public static void main(String[] args) {
        Stack<String>val = new Stack<>();
        String prefix = "-9/*+5346";
        for(int i = prefix.length()-1;i>=0;i--){
            char ch = prefix.charAt(i);
            int asci = (int)ch;
            if(asci>=48&&asci<=57)  val.push(String.valueOf(asci-48));
            else{
                String s1 = val.pop();
                String s2 = val.pop();
                val.push(s1+s2+ch);
            }
        }
        String postfix = val.pop();
        System.out.println(postfix);
    }
}
