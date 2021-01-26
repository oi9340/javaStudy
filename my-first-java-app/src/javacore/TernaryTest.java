package javacore;

public class TernaryTest {
    public static void main(String[] args) {

        String case1 = "uppercase";
        String name = case1.equals("uppercase")?"JOHN":"john";
//        System.out.println(name);

        //Ternary Operator as Null Check
//        String test = "test";
//        String value = test != null ? test.getValue(): null;

        //Ternary Operator as max Function
        int val1 = 10;
        int val2 = 20;
        int max = val1 > val2 ? val1 : val2;
//        System.out.println(max);

        //Ternary Operator as min Function
        int min = val1 <= val2 ? val1 : val2;
//        System.out.println(min);

        //Ternary Operator as abs Function
        int abs = val1 >= 0 ? val1 : -val1;
        System.out.println(abs);

        //Chained Ternary Operators
        String input = new String("0");
        int value2 = input == null ? 0 : input.equals("") ? 0 : Integer.parseInt(input);
    }
}
