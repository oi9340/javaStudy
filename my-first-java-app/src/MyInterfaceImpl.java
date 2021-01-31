import javalanguage.MyInterface;
import javalanguage.MyOtherInterface;

public class MyInterfaceImpl implements MyInterface, MyOtherInterface {
    @Override
    public void sayHello() {
        System.out.println("class hello");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("class good bye");
    }

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHello();
        MyInterface.print("static???");

        MyOtherInterface myOtherInterface = new MyInterfaceImpl();
        myOtherInterface.sayGoodbye();
    }


}
