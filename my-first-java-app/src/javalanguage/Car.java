package javalanguage;

public class Car extends Vehicle{
    private String brand = null;
    int numberOfSeats = 0;

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    @Override
    public void setLicensePlate(String license){
//        this.licensePlate = license.toLowerCase();

        System.out.println("sub class");
        super.setLicensePlate(license);
    }

    public Car(String br, String no){
        super(no);
        this.brand = br;
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Car car = new Car("benz", "9340");
        boolean isCar = car instanceof Car;
        boolean isVehicle = car instanceof  Vehicle;

        System.out.println(isCar);
        System.out.println(isVehicle);
//        System.out.println(car.getLicensePlate());
        //Vehicle vh = car;
        //Car car2 = (Car)vh; //ClassCastException?????
        //car.setLicensePlate("123");
    }

}
