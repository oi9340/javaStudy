package javacollection;

import java.util.*;

public class Car {

    public String brand;
    public String numberPlate;
    public int noOfDoors;

    public Car(String brand, String numberPlate, int noOfDoors){
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.noOfDoors = noOfDoors;
    }

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("volvo","123",3));
        list.add(new Car("sonata","111",4));
        list.add(new Car("abante","777",7));

        Comparator<Car> carBrandComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.compareTo(o2.brand);
            }
        };

        Collections.sort(list, carBrandComparator);

        for (Car cars : list){
            System.out.println(cars.brand);
        }

    }
}
