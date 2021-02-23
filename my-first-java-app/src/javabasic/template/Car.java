package javabasic.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void starCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public void washCar(){} //hook method : 필수로 재정의 하지 않는 메서드

    public final void run(){
        starCar();
        drive();
        stop();
        turnOff();
    }
}

