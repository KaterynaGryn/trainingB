public class Employee extends Person {
    private String employee;
    private String role;
    private Float salary;
    private String company;



    public Employee(int id, String firstName, String lastName, int age, Enum role) {
        super(id, firstName, lastName, age);
    }


}

