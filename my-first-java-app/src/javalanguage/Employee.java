package javalanguage;

public class Employee {

    private String firstName = null;
    private String lastName = null;
    private int birthYear = 0;

    public Employee(String first, String second, int year){
        firstName = first;
        lastName = second;
        birthYear = year;

        System.out.println(first+" "+second+" "+year);
    }

    public Employee(String first, String last){
        this(first, last, 2011);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Lee", "min");
        Employee employee2 = new Employee("Kim", "jin", 2012);
    }
}
