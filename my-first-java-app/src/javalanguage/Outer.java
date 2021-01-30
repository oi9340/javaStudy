package javalanguage;

public class Outer {

    private String text = "I am Outer private!";
    public static class Nested{

    }

    public class Inner{

        private String text = "I am Inner private!";

        public void printText(){
//            System.out.println(text);
            System.out.println(Outer.this.text);
        }
    }

    public static void main(String[] args) {
        Outer.Nested instance = new Outer.Nested();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printText();

    }
}
