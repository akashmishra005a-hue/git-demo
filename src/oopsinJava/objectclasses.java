package oopsinJava;

import java.util.Objects;

class Calc
{
    String model;
    int serialnumber;
    public String toString()
    {
        return "print object refference";
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Calc calc = (Calc) o;
        return serialnumber == calc.serialnumber && Objects.equals(model, calc.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, serialnumber);
    }
}
public class objectclasses {
    public static void main(String[] args) {
       Calc c = new Calc();
        c.model = "Lenovoideapad";
        c.serialnumber = 1;
       Calc c1 = new Calc();
       c1.model = "Lenovoideapad";
       c1.serialnumber = 1;
        System.out.println(c.equals(c1));
        System.out.println(c.hashCode());


    }
}
