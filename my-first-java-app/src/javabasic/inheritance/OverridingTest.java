package javabasic.inheritance;

public class OverridingTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        int priceLee = customerLee.calcPrice(10000);

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo()+" 지불금액은 "+priceLee+"원 입니다.");
        System.out.println(customerKim.showCustomerInfo()+" 지불금액은 "+priceKim+"원 입니다.");

        Customer customerPark= new VIPCustomer();
        customerPark.setCustomerID(10030);
        customerPark.setCustomerName("박혁거세");
        customerPark.bonusPoint = 10000;
        System.out.println(customerPark.showCustomerInfo()+" 지불금액은 "+customerPark.calcPrice(10000)+"원 입니다.");

    }
}
