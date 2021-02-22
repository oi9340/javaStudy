package javabasic.polymorphsim;

public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(){
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        salesRatio = 0.1;
        System.out.println("GOLD 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
