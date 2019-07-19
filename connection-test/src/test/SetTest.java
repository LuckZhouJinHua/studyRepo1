package test;

import jdk.nashorn.internal.objects.annotations.Where;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * @author Casual developer
 *
 */
public class SetTest {
    public static void main(String[] args) {
        Set sSet = new HashSet();
        sSet.add("1");
        sSet.add("2");
        sSet.add("3");
        sSet.add("1");

        if(3>2)
            System.out.println(333333);
        Iterator iterator = sSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
