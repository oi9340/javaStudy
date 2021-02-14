package javabasic.statictest;

public class StudentIDTest {

    public static void main(String[] args) {
        Student studentLee = new Student(1, "lee");
        System.out.println(Student.getSerialNum());

        Student studentKim = new Student(2, "kim");
        System.out.println(Student.getSerialNum());

        System.out.println(Student.getSerialNum());

        System.out.println();

        System.out.println(studentLee.studentID);
        System.out.println(studentKim.studentID);
    }
}
