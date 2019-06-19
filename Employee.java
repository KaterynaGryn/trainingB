public class Employee extends Person {
    private String employee;
    private String role;
    private Float salary;
    private String company;

    enum Company {
        CIKLUM,
        EPAM,
        INFOPULSE,
        WIX,
        GLOBAL_LOGIC,
        LUXOFT
    }

    public Employee(int id, String firstName, String lastName, int age) {
        super(id, firstName, lastName, age);
    }


}

