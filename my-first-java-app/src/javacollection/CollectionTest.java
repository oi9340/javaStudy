package javacollection;

import java.util.*;

public class CollectionTest {

    public static void doSomething(Collection collection){
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
//            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("test1");
        set.add("test2");

        List list = new ArrayList();
        list.add("test3");
        list.add("test4");

//        CollectionTest.doSomething(set);
//        CollectionTest.doSomething(list);

        Collection collection   = new HashSet();
        collection.addAll(set);
        boolean containsElement = collection.contains("test1");
        System.out.println(containsElement);

        Collection elements     = new HashSet();
        elements.addAll(set);
        boolean containsAll     = collection.containsAll(elements);
        System.out.println(containsAll);
        System.out.println(collection.size());

        for(Object object : collection){
            System.out.println(object);
        }
    }
}
