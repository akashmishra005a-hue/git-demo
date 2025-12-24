package Practice;
class CustomException extends Exception
{
    String s;

    public CustomException(String s)
    {
        super(s);
        this.s = s;
    }
}
public class Custom_Exception {
    public static void main(String[] args) {
        int a =0;
        int b =1;
        int c =0;
        try{
            c = a/b;
            if(c==0){
                throw new CustomException("c can not be Zero");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
