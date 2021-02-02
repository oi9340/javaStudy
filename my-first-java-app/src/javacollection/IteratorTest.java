package javacollection;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("123");
        list.add("456");
        list.add("789");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            Object nextObject= iterator.next();
            if(nextObject.equals("456")){
//                list.add("999");
                iterator.remove();
            }
            System.out.println(nextObject);
        }

        System.out.println(iterator.hasNext());
        System.out.println();

        Iterator<String> iterator2 = list.iterator();
        iterator2.forEachRemaining((element) -> {
            System.out.println(element);
        });

        System.out.println();

        Set<String> set = new HashSet<>();
        set.add("four");
        set.add("five");
        set.add("six");

        set.add("123");
        set.add("456");
        set.add("789");

        Iterator<String> iterator1 = set.iterator();
        while(iterator1.hasNext()){
            Object nextObject = iterator1.next();
            System.out.println(nextObject);
        }

        System.out.println();

        List<String> lists = new ArrayList<>();
        lists.add("tom");
        lists.add("jenny");
        lists.add("sally");
        ListIterator<String> listIterator = lists.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
