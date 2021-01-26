package javacore;

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
//        System.out.println("myString1 : "+myString1.hashCode());
//        System.out.println("myString2 : "+myString2.hashCode());

        String myString3 = new String("Hello World");
        String myString4 = new String("Hello World");
//        System.out.println("myString3 : "+myString3.hashCode());
//        System.out.println("myString4 : "+myString4.hashCode());

//        System.out.println(myString1 == myString2);
//        System.out.println(myString3 == myString4);

//        String textblock = """
//                   This is a text inside a
//                   text block
//                   """;
//        System.out.println(textblock);

        String one = "Hello";
        String two = "World";
        //String three = one+" "+two;
        //System.out.println(one);
        //System.out.println(two);
        //System.out.println(three);

        String three = new StringBuilder(one).append(two).toString();
        //System.out.println(three);

//        String[] strings = new String[] {"one", "two", "three", "four", "five"};
//        String result = null;
//        for(String string : strings) {
//            result = result + string;
//        }
//        System.out.println(result);

        String[] strings2 = new String[] {"one", "two", "three", "four", "five"};
        StringBuilder temp = new StringBuilder();
        for(String string : strings2){
            temp.append(string);
        }
        String result2 = temp.toString();
        //System.out.println(result2);

        String string3 = "Hello World";
        int length = string3.length();
        //System.out.println(length);

        String subString = string3.substring(0,5);
        //System.out.println(subString);

        int index = string3.indexOf("World");
        //System.out.println(index);

        String theString = "is this good or is this bad?";
        String subString2 = "is";
        int index2 = theString.indexOf(subString2);
        while(index2 != -1){
            System.out.println(index2);
            index2 = theString.indexOf(subString2, index2+1);
        }

        int index3 = theString.lastIndexOf(subString2);
        System.out.println(index3);

        String text = "one two three two one";
        boolean matches = text.matches(".*three.*");
        System.out.println(matches);



    }


}
