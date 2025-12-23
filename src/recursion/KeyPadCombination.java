package recursion;

public class KeyPadCombination {
    public static void printcombination(String digits,String[]kp,String result){
        if(digits.length()==0){
            System.out.print(result+" ");
            return;
        }
        int current_digit = digits.charAt(0)-'0';
        String choices = kp[current_digit];
        for(int i=0;i<choices.length();i++){
            printcombination(digits.substring(1),kp,result+choices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String digits = "23";
        String []kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printcombination(digits,kp,"");
    }
}
