package oopsinJava;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class stream{
    public static void main(String[] args) {

       Predicate<Integer> p = n-> n%2==0;
//            Consumer<Integer>c =  t-> System.out.println(t);

        Set<Integer> st = new HashSet<>();
        st.add(23);
        st.add(46);
        st.add(54);
        st.add(92);
        st.add(230);
       Stream<Integer> s = st.stream();
           Stream<Integer>sa = s.filter(n->n%2==0);

       sa.forEach(n-> System.out.println(n));

    }

}
