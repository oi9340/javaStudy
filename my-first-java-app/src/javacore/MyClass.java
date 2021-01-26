package javacore;

public class MyClass {
    protected final String name = "John";
    private int a;
    public static int b;

    // instance initializer block (인스턴스 초기화 블럭)
    {
        a = 11;
        b = 22;

        //System.out.println("a : "+a);
        //System.out.println("b : "+b);
    }

    // static initializer block (클래스 초기화 블럭)
    static {
        b = 33;
        //System.out.println("b : "+b);
    }

    public MyClass(){ }

    public String getName(){
        return this.name;
    }

    public void printBoth(String text1, String text2){
        print(text1);
        print(text2);
    }

    public void print(String text){
        System.out.println(text);
    }

    public void methodOne(String input){
        if(isValid(input)){
            System.out.println(input+" is valid");
        }else{
            System.out.println(input+" is not valid");
        }
    }

    public boolean isValid(String value){
//        if(value.equals("123")){
//            return true;
//        }
//        return false;
        return value.equals("123");
    }

    public static void main(String[] args) {
        int number = 10;
        //System.out.println(number);
        number = number + 20;
        //System.out.println(number);

        int myVariable;

        byte myByte;
        short myShort;
        char myChar;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;

        Byte myBytes;
        Short myShorts;
        Character myChars;
        Integer myInts;
        Long myLongs;
        Float myFloats;
        Double myDoubles;
        String myStrings;

        myByte = 127;
        myFloat = 199.9f;
        myStrings = "This is a text";

        float myFloat1 = 199.99f;
        float myFloat2 = myFloat1;
        float myFloat3 = myFloat2 + 123.45f;

        System.out.println(myFloat3);

        int myvar;
        int myVar;
        int MYVAR;
        int _myVar;
        int $myVar;
        int myVar1;
        int myVar_1;

        Integer myInteger;
        myInteger = new Integer(45);
        System.out.println(myInteger);

        int sum1 = 10+20;
        int sum2 = sum1 + 33;
        int sum3 = sum2 + sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int sum4 = 10+20+30;
        int sum5 = sum4+99+123+1191;
        System.out.println(sum4);
        System.out.println(sum5);

//        int result = 10;
//        result = result + 20;
//        System.out.println(result);

        int result = 10;
        result += 20;
        System.out.println(result);

        int diff1 = 200 - 10;
        int diff2 = diff1 - 5;
        int diff3 = diff1 - diff2;

        System.out.println("diff1 "+diff1);
        System.out.println("diff2 "+diff2);
        System.out.println("diff3 "+diff3);

        int diff4 = 200-10-20;
        System.out.println("diff4 "+diff4);

        int  diff5 = 200 - (-10);
        System.out.println("diff5 "+diff5);


        int resultdiff = 200;
        resultdiff -= 20;
        System.out.println(resultdiff);

        int prod1 = 10*20;
        int prod2 = prod1 * 5;
        int prod3 = prod1 * prod2;
        System.out.println("prod1 "+prod1);
        System.out.println("prod2 "+prod2);
        System.out.println("prod3 "+prod3);

        int prod4 = 10*20*30;
        System.out.println("prod4 "+prod4);

        int prod5 = 10;
        prod5 *= 5;
        System.out.println("prod5 "+prod5);

        int division1 = 100/10;
        int division2 = division1 / 2;
        int division3 = division1 / division2;
        System.out.println("division1 "+division1);
        System.out.println("division2 "+division2);
        System.out.println("division3 "+division3);

        int division4 = 100/10/2;
        System.out.println("division4 "+division4);

        int division5 = 100/(10/2);
        System.out.println(division5);

        int division6 = 100;
        division6 = division6 / 5;
        System.out.println(division6);

        int division7 = 100;
        division7 /= 5;
        System.out.println(division7);

        int value = 100;
        int remainder = value % 9;
        System.out.println("remainder "+remainder);

        int value2 = 100;
        value2 %= 9;
        System.out.println(value2);

        int operationTest = 100 * 100 / 5 + 200 * 3 / 2;
        System.out.println(operationTest);

        double operationTest2 = 100D / 8D;
        System.out.println("operationTest2 "+operationTest2);

        double no1 = 100;
        double no2 = 8;

        double resultOperation = no1 / no2;
        System.out.println("result operation :"+resultOperation);

        double resultDbl3 = 0D;
        System.out.println("resultDbl3 ="+resultDbl3);

        for(int i=0; i<100; i++){
            resultDbl3 += 0.01D;
        }
        System.out.println("resultDbl3 ="+resultDbl3);

    }
}
