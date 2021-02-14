package javabasic.thistest;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.showInfo();


        Person personLee = new Person("Lee", 29);
        personLee.showInfo();

        System.out.println(personLee);
        System.out.println(personLee.getSelf());


    }
}
