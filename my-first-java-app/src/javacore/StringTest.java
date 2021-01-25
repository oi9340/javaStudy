package javacore;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringTest {

    public static void main(String[] args) {
        //String myString = new String("HelloWorld");
        //System.out.println(myString);

        //String myString2 = "HelloWorld shot"; //String literal
        //System.out.println(myString2);

        //String text = "\tThis text is one tab in.\r\n";
        //System.out.println(text);

        String myString1 = "Hello World";
        String myString2 = "Hello World";
        System.out.println("myString1 : "+myString1.hashCode());
        System.out.println("myString2 : "+myString2.hashCode());

        String myString3 = new String("Hello World");
        String myString4 = new String("Hello World");
        System.out.println("myString3 : "+myString3.hashCode());
        System.out.println("myString4 : "+myString4.hashCode());

        System.out.println(myString1 == myString2);
        System.out.println(myString3 == myString4);

//        String textblock = """
//                   This is a text inside a
//                   text block
//                   """;
//        System.out.println(textblock);
    }


}
