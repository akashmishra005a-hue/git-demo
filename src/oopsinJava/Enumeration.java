package oopsinJava;
enum Stauts
{
    Running(10),Pending(20) ,Failed,Sucess(30);
    int prcs;
    private Stauts(int prcs)
    {
        this.prcs = prcs;
    }
    private Stauts(){
prcs = 100;
    }

    public int getPrcs() {
        return prcs;
    }

    public  void setPrcs(int prcs) {
        this.prcs = prcs;
    }
}
public class Enumeration {
    public static void main(String[] args) {
        Stauts s = Stauts.Failed;
        System.out.println(s);
        for(Stauts sa : Stauts.values())
{
    System.out.println(sa+":"+sa.prcs);}

    }
}
