package javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "test1","test2","test3");

//        Collections.sort(list);
//
//        int index = Collections.binarySearch(list, "test3");
//        System.out.println(index);

        List<String> copyList = new ArrayList<>();
        Collections.addAll(copyList, "", "", "");
        Collections.copy(copyList, list);

//        Collections.reverse(copyList);
//        Collections.shuffle(copyList);

        List lists = new ArrayList();
        lists.add("test1");
        lists.add("test2");
        lists.add("test1");
        lists.add(0, "33333");

//        lists.addAll(list);

        List subList = lists.subList(1,1);

        System.out.println(lists.get(0));
        System.out.println(lists.lastIndexOf("test1"));
        System.out.println();
//        List lists2 = Collections.unmodifiableList(lists);
//        lists2.add("test2222");

//        boolean replacedAny = Collections.replaceAll(lists,"test1","111");
//        System.out.println(replacedAny);

//        lists.clear();
        Iterator<String> iterator = subList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println(subList.size());
//        boolean containsList = lists.contains("test1");
//        boolean containsList = lists.contains(null);
//        System.out.println(containsList);


    }
}
