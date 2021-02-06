package javaBasic;

public class FunctionTest {

    public static int addNum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    //반환 값이 없는 함수
    public static void sayHello(String greeting){
        System.out.println(greeting);
    }

    public static int calcSum(){

        int sum = 0; //초기화 필요!
        int i;

        for (i=0; i<=100; i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int sum = addNum(n1, n2);
        System.out.println(sum);
        
        sayHello("안녕하세요");

        int num = calcSum();
        System.out.println(num);
    }

}
