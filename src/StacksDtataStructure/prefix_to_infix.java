package StacksDtataStructure;

import java.util.Stack;

public class prefix_to_infix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            int asci = (int) ch;
            if (asci >= 48 && asci <= 57) val.push(String.valueOf(asci - 48));
            else {
                String s1 = val.pop();
                String s2 = val.pop();
                val.push(s1 + ch + s2);
            }
        }
        String infix = val.pop();
        System.out.println(infix);
    }
}
