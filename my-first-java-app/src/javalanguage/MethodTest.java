package javalanguage;

public class MethodTest {
    public int sum(int val1, int val2){
        return val1 + val2;
    }
    public String concat(String str1, String str2){
        return str1 + str2;
    }
    public String concat2(String str1, String str2, boolean orderType){
        if(orderType){
            return str2 + str1;
        }
        return str1 + str2;
    }
    public void callSum(){
        int theSum = sum(1,3);
        System.out.println(theSum);
    }

    public static void main(String[] args) {
        MethodTest mt = new MethodTest();
        System.out.println(mt.sum(1,2));
        System.out.println(mt.concat("test","hello"));
        System.out.println(mt.concat2("test","lalalal",false));
        mt.callSum();
    }

}
