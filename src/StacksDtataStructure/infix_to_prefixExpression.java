package StacksDtataStructure;
import java.util.Stack;
public class infix_to_prefixExpression {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String>val = new Stack<>();
        Stack<Character>op = new Stack<>();
        String s = "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=48&&asci<=57) val.push(String.valueOf(asci-48));
            else if(op.size()==0||ch=='('||op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    String val2 = val.pop();
                    String val1 = val.pop();
//                    char o = op.peek();
                    s = s+op.peek()+val1+val2;
                    val.push(s);
                    op.pop();
                } op.pop();
            }
             else{
                 if(ch=='+'||ch=='-'){
                     String val2 = val.pop();
                     String val1 = val.pop();
//                     char c = op.peek();
                     val.push(op.peek()+val1+val2);
                     op.pop();
                     op.push(ch);
                 }
                 if(op.peek()=='*'||op.peek()=='/'){
                     String val2 = val.pop();
                     String val1 = val.pop();
//                     char c = op.peek();
                     val.push(op.peek()+val1+val2);
                     op.pop();
                     op.push(ch);
                 } else op.push(ch);
            }

        }
       while(val.size()>1){
           String val2 = val.pop();
           String val1 = val.pop();
//           char c = op.peek();
           val.push(op.peek()+val1+val2);
           op.pop();
       }
        System.out.println(val.peek());
    }
}
