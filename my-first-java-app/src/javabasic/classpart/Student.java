package javabasic.classpart;
//하나의 자바 파일에 클래스는 여러개 생성 가능하나 public 클래스는 단 한개 그리고 자바 파일과 이름이 동일해야한다.
public class Student {

    //멤버변수
    public int studentID;
    //public : 접근 제어자
    String studentName;
    String address;

    //생성자
    public Student(int id, String name){
        studentID = id;
        studentName = name;
    }

    //메서드 : 함수의 일종
    //void : 반환 type
    public void showStudentInfo(){
        //showStudentInfo(매개변수)
        System.out.println(studentName+","+address);
    }

    //메서드 오버로딩
    public void showStudentInfo(int id){
        System.out.println(id);
    }

    public static void main(String[] args) { //테스트용 실제는 없는 클래스
        //Student 클래스의 메서드로 보지 않는다.

        Student st = new Student(123, "toms"); //Student 클래스가 메모리에 생성됨
        //st : 참조변수
        st.address = "test";
       // st.studentName = "eunji";
       // st.studentID = 123;

        st.showStudentInfo();

        Student st2 = new Student(234 , "eunji");
       // st2.studentName = "tom";
        st2.address = "test";
       // st2.studentID = 234;

        st2.showStudentInfo();
        st2.showStudentInfo(123);

        System.out.println(st); //javaBasic.classpart.Student@7cc355be
        System.out.println(st2); //javaBasic.classpart.Student@6e8cf4c6
    }
}
