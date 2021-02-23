package javabasic.template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }
}
