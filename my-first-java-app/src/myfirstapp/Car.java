package myfirstapp;

public class Car {

    private String brand; //fields

    public Car(String theBrand){ //constructor
        this.brand = theBrand;
    }

    public String getBrand(){ //method
        return this.brand;
    }
}
