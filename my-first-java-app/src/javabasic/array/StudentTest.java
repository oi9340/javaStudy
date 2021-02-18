package javabasic.array;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        Student studentLKim = new Student(1002, "Kim");

        studentLee.addSubject("국어" , 80);
        studentLee.addSubject("수학" , 100);

        studentLKim.addSubject("국어" , 100);
        studentLKim.addSubject("수학" , 70);
        studentLKim.addSubject("영어" , 100);

        studentLee.showStudentInfo();
        System.out.println();
        studentLKim.showStudentInfo();
    }
}
