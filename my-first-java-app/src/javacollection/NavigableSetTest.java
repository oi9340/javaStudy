package javacollection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
    public static void main(String[] args) {

        NavigableSet navigableSet = new TreeSet();
        navigableSet.add("test1");
        navigableSet.add("test2");
        navigableSet.add("test3");
        navigableSet.add("test4");
        navigableSet.add("test5");

//        NavigableSet navigableSet1 = navigableSet.descendingSet();

//        System.out.println(navigableSet);

//        System.out.println(navigableSet1);

//        Iterator iterator = navigableSet.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        NavigableSet headSet = navigableSet.headSet("test3", false);
        System.out.println(headSet);

        NavigableSet tailSet = navigableSet.tailSet("test2", true);
        System.out.println(tailSet);

        NavigableSet subSet = navigableSet.subSet("test2", true, "test4", true);
        System.out.println(subSet);

        NavigableSet navigableSet2 = new TreeSet();
        navigableSet2.add("1");
        navigableSet2.add("2");
        navigableSet2.add("3");
        navigableSet2.add("5");

        Object ceiling = navigableSet2.ceiling("2");
        System.out.println(ceiling);

        Object floor = navigableSet2.floor("2");
        System.out.println(floor);

        Object higher = navigableSet2.higher("2");
        System.out.println(higher);

        Object lower = navigableSet2.lower("2");
        System.out.println(lower);

        Object first = navigableSet2.pollFirst();
        System.out.println(first);

        Object last= navigableSet2.pollLast();
        System.out.println(last);
    }
}
