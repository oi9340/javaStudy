package javacollection;

import java.util.*;
import java.util.stream.Stream;

public class MapTest {

    public static void main(String[] args) {
        Map mapA = new HashMap();
        Map mapB = new TreeMap();

        Map<String, String> map = new HashMap<>();
        map.put("key1", "element1");
        map.put("key2", "element2");
        map.put("key3", "element3");
        map.put("key3", "element4");
        map.put(null, "element5");

//        String value = map.get(null);

//        System.out.println(map);
//        System.out.println(value);

        Map<String, String> mapC = new HashMap<>();
        mapC.put("key1", "value1");
        mapC.put("key2", "value2");

        Map<String, String> mapD = new HashMap<>();
        mapD.putAll(mapC);

//        System.out.println(mapC);
//        System.out.println(mapD);

        String values = mapC.getOrDefault("key3", "default");
//        System.out.println(values);

        boolean check = mapC.containsKey("key3");
//        System.out.println(check);

        boolean checkValue = mapC.containsValue("value1");
//        System.out.println(checkValue);

        //key
//        Iterator iterator = mapC.keySet().iterator();
//        while (iterator.hasNext()){
////            System.out.println(iterator.next());
//        }
//
//        for (String str : mapC.keySet()){
////            System.out.println(str);
//        }
//
//        Stream<String> stream = mapC.keySet().stream();
//        stream.forEach((value)->{
////            System.out.println(value);
//                }
//        );

        //value
//        Iterator<String> iterator1 = mapC.values().iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }
//
//        for(String str : mapC.values()){
//            System.out.println(str);
//        }
//
//        Stream<String> stream = mapC.values().stream();
//        stream.forEach((value)->{
//            System.out.println(value);
//                }
//        );


//        mapC.remove("key1");
//        mapC.clear();

//        mapC.replace("key1","11111");

        //key + value
        Set<Map.Entry<String, String>> entries = mapC.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }

        for(Map.Entry<String, String> entry : mapC.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }

        System.out.println(mapC.size());
        System.out.println(mapC.isEmpty());

    }


}
