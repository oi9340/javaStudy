package javacore;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class InstanceofTest {

    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap();
        boolean mapIsObject = map instanceof Object;
        System.out.println(mapIsObject);

        HashMap<Object, Object> map2 = new HashMap();
        boolean mapIsObject2 = map instanceof HashMap;
        System.out.println(mapIsObject2);

        //Instanceof With Interface
        HashMap<Object, Object> map3 = new HashMap();
        boolean mapIsObject3 = map3 instanceof Map; //HashMap 클래스가 Map 인터페이스를 구연하기 때문에 true
        System.out.println(mapIsObject3);

        //Instanceof With Superinterface
        SortedMap<Object, Object> map4 = new TreeMap();
        boolean mapIsObject4 = map4 instanceof Map;
        System.out.println(mapIsObject4);

        //Instanceof With null
        Map<Object, Object> map5 = null;
        boolean mapIsObject5 = map5 instanceof Map;
        System.out.println(mapIsObject5);

        Map<Object, Object> map6 = new TreeMap();

        if(map6 instanceof SortedMap){
            SortedMap sortedMap = (SortedMap) map6;
            System.out.println("here");
        }

        //instanceof With Pattern Matching

    }
}
