package javacollection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        Comparator comparator = sortedSet.comparator();

        sortedSet.add("test1");
        sortedSet.add("test2");
        sortedSet.add("test3");
        sortedSet.add("test4");
        sortedSet.add("test5");

//        sortedSet.remove("test1");
//        System.out.println(sortedSet);

        Object first = sortedSet.first();
//        System.out.println(first);

        Object last = sortedSet.last();
//        System.out.println(last);

        Iterator iterator = sortedSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        SortedSet headSet = sortedSet.headSet("test3");
//        System.out.println(headSet);

        SortedSet tailSet = sortedSet.tailSet("test2");
//        System.out.println(tailSet);

        SortedSet subSet = sortedSet.subSet("test2", "test4");
        System.out.println(subSet);

        SortedSet<String> strSS = new TreeSet<>();
        strSS.add("test1");
        System.out.println(strSS);

    }


}
