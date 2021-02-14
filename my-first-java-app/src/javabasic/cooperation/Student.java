package javabasic.cooperation;

public class Student {

    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){ //Bus bus 객체 협업
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){ //Subway subway 객체 협업
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(3000);
        this.money -= 3000;
    }


    public void showInfo(){
        System.out.println(studentName+"님의 남은 돈은 "+money+"원 입니다.");
    }
}
