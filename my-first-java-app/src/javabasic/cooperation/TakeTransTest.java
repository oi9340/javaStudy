package javabasic.cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student student1 = new Student("tom", 3000);
        Student student2 = new Student("jenny", 5000);
        Student student3 = new Student("adward", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(1);

        Taxi taxi = new Taxi();

        student1.takeBus(bus100);
        student2.takeSubway(subwayGreen);
        student3.takeTaxi(taxi);

//        student1.showInfo();
//        student2.showInfo();
//        bus100.showBusInfo();
//        bus500.showBusInfo();
//        subwayBlue.showSubwayInfo();
//        subwayGreen.showSubwayInfo();

        student3.showInfo();
        taxi.showInfo();

    }
}
