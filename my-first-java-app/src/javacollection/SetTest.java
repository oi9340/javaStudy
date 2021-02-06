package javacollection;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set setA = new HashSet();
        setA.add("test"); //"test" 라는 요소 추가
//        System.out.println(setA.contains("test")); //"test"가 있는지 확인

        Set setB = new HashSet();
        Set setC = new LinkedHashSet();
        Set setD = new TreeSet();

        Set<Car> set = new HashSet<Car>(); //generic

        Set setF = Set.of("123");
//        setF.add("112"); //오류발생
        System.out.println(setF);

        Set<String> setTest = new HashSet<>();
        setTest.add("test1");
        setTest.add("test2");
        setTest.add("test3");

        setTest.remove("test3");

        System.out.println(setTest);
        Iterator<String> iterator = setTest.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String str : setTest){
//            System.out.println(str);
        }

        List<String> ls = new ArrayList<>();
        ls.add("happy");

        ls.addAll(setTest);
        System.out.println(ls);

    }
}
