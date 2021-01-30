package javalanguage;

public class SuperClass {
    public void doIt(){
        System.out.println("Super Class doIt()");
    }

    public static void main(String[] args) {
        SuperClass instance = new SuperClass(){
            public void doIt(){
                System.out.println("Anonymous class doIt()");
            }
        };
        instance.doIt();

    }
}
