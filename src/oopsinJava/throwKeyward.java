package oopsinJava;
class AkashException extends Exception
{

AkashException(String s) {
super(s);
}
}
public class throwKeyward {
    public static void main(String[] args) {
        String s= "Akash";
        char c;
        int a = 0;
        int b = 1;
            try {
            b = a/b;
            if(b==0){
              throw new AkashException("not divided by zero");
            }
        }
            catch (Exception e){
                System.out.println("by default value is"+e);
                b = 1;
            }

        System.out.println(b);
        System.out.println("progrmm is execute");
    }
}
