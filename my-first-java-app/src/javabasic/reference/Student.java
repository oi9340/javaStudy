package javabasic.reference;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int id, String name){

        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public void koreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
        System.out.println("koreasubject "+score);
    }

    public void mathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
        System.out.println("mathsubject "+score);
    }

    public void showStudentScore(){
        int total = korea.score + math.score;
        System.out.println(korea.score);
        System.out.println(math.score);
        System.out.println(studentName+"님의 총점은 "+total+"점 입니다.");
    }

    public static void main(String[] args) {

        Student str1 = new Student(100, "lee");
        str1.koreaSubject("국어", 89);
        str1.mathSubject("수학", 90);

        Student str2 = new Student(101, "kim");
        str2.koreaSubject("국어", 79);
        str2.mathSubject("수학", 90);

        str1.showStudentScore();
        str2.showStudentScore();

    }

}
