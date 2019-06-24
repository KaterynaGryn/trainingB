public class Employee extends Person {

    private Role role;
    private float salary;
    private Company company;


    public Employee(int id, String firstName, String lastName, Role role, Float salary, Company company) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        this.role = role;
        this.salary = salary;
        this.company = company;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

