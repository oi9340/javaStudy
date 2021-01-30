package javalanguage;

public class OperationTest {

    public static void main(String[] args) {

        int age;
        age = 30;
        int yearBorn = 1992;

        String name = "jakob";
        String name2 = name;

        int sum = 123+456;
//        System.out.println(sum);

        int price1 = 123;
        int price2 = 456;
        int total = price1 + price2;
        int totalPlusFee = total+999;
//        System.out.println(price1);
//        System.out.println(price2);
//        System.out.println(total);
//        System.out.println(totalPlusFee);

        int diff = 456-123;
//        System.out.println(diff);

        int result = 123*456;
//        System.out.println(result);

        int result2 = 100/10;
//        System.out.println(result2);

        int price3 = 12;
        int amout = 23;
        int totalPrice2 = price3 * amout;
        int disscount = 20;
        int totalAfterDiscount = (totalPrice2*(100-disscount)) / 100;
//        System.out.println(price3);
//        System.out.println(amout);
//        System.out.println(totalPrice2);
//        System.out.println(totalAfterDiscount);

        MyClass myClassInstance = new MyClass();

        int amout2 = 9;
        if(amout2 > 9){
//            System.out.println("amount is greater than 9");
        }else{
//            System.out.println("amout is 9 or less");
        }

//        switch (amout2){
//            case 0:
//                System.out.println("0"); break;
//            case 5:
//                System.out.println("5"); break;
//            case 10:
//                System.out.println("10"); break;
//            default:
//                System.out.println("etc");
//        }

        for(int i=0; i<10; i++){
//            System.out.println("I is :"+i);
        }

        int amout1 = 0;
        while(amout1 < 10){
            System.out.println("amount is :"+amout1);
            amout1++;
        }


    }
}

