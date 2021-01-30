package javalanguage;

import java.nio.charset.Charset;

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
            //System.out.println(index2);
            index2 = theString.indexOf(subString2, index2+1);
        }

        int index3 = theString.lastIndexOf(subString2);
        //System.out.println(index3);

        String text = "one two three two one";
        boolean matches = text.matches(".*three.*");
        //System.out.println(matches);

        String one1 = "abc";
        String two1 = "def";
        String three1 = "abc";
        String four1 = "ABC";
//        System.out.println(one1.equals(two1));
//        System.out.println(one1.equals(three1));
//        System.out.println(one1.equals(four1));
//        System.out.println(one1.equalsIgnoreCase(four1));

        String one2 = "This is a good day to code";
//        System.out.println(one2.startsWith("This"));
//        System.out.println(one2.startsWith("This", 5));
//        System.out.println(one2.startsWith("good", 10));
//        System.out.println(one2.endsWith("code"));
//        System.out.println(one2.endsWith("shower"));

        String one3 = "abc";
        String two3 = "def";
        String three3 = "abd";
//        System.out.println(two3.compareTo(one3));
//        System.out.println(one3.compareTo(three3));

        String text2 = "   And he ran across the field    ";
        String trmmed = text2.trim();
        //System.out.println(text2);
        //System.out.println(trmmed);

        String source = "123abc";
        String replaced = source.replace('a','@');
        //System.out.println(replaced);

        String text4 = "one two three two one";
        String s = text4.replaceFirst("two","five");
        //System.out.println(s);

        String t = text4.replaceAll("two", "five");
        //System.out.println(t);

        String source2 = "A man drove with a car.";
        String[] occurrences = source2.split("a");
        //System.out.println(Arrays.toString(occurrences));
        int limit = 2;
        String[] occureences2 = source2.split("a", limit);
        //System.out.println(Arrays.toString(occureences2));

        String intStr = String.valueOf(10);
        //System.out.println(intStr);
        String flStr = String.valueOf(9.99);
        //System.out.println(flStr);

        Integer integer = new Integer(123);
        String inStr = integer.toString();
//        System.out.println(inStr);

        String theString2 = "This is a good day to code";
        //System.out.println(theString2.charAt(0));
        //System.out.println(theString2.charAt(3));

        String theString3 = "This is a good day to code";
        byte[] bytes1 = theString3.getBytes();
        byte[] bytes2 = theString3.getBytes(Charset.forName("UTF-8"));
        //System.out.println(Arrays.toString(bytes1));
        //System.out.println(Arrays.toString(bytes2));

        String theString4 = "This IS a mix of UPPERcase and lowerCASE";
        String uppercase = theString4.toUpperCase();
        String lowercase = theString4.toLowerCase();
//        System.out.println(uppercase);
//        System.out.println(lowercase);

        String input = "Hello %s";
//        String output1 = input.formatted("World");
//        System.out.println(output1);

//        String output2 = input.formatted("Jakob");
//        System.out.println(output2);

        String input2 = "   Hey \n  This \n is\n    indented.";
//        String output3 = input2.stripIndent();
//        System.out.println(output3);

        String input3 = "Hey, \\n This is not normally a line break.";
//        System.out.println(input3);
//        String output4 = input3.translateEscapes();
//        System.out.println(output4);







    }

}
