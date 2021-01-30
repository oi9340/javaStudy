package javalanguage;

public class Vehicle {
    private String regNo = null;
    protected String licensePlate = null;

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
        System.out.println("supper class");
    }

    protected Vehicle(String no){
        this.regNo = no;
        System.out.println(regNo);
    }
}
