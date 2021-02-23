package javabasic.abstracttest;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("Desktop 화면이 출력됩니다.");
    }

    @Override
    public void typiing() {
        System.out.println("Desktop 키보드를 typing 합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turn off");
    }
}
