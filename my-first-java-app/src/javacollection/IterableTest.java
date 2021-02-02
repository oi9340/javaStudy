package javacollection;

import java.util.*;

public class IterableTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        for(String element : list){
            System.out.println(element.toString());
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.forEach((element) ->{
            System.out.println(element);
        });
    }

}
