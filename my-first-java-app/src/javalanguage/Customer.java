package javalanguage;

public class Customer {
    static String staticField1;
    String field1;
    final String field2 = "test3";
    static final String field3 = "test4";

}
class FieldTest {

    public static void main(String[] args) {
        //static
        Customer.staticField1 = "test";
        System.out.println(Customer.staticField1);

        Customer customer = new Customer();
        customer.field1 = "test2";
        System.out.println(customer.field1);


    }
}