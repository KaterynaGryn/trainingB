import java.util.Arrays;
import java.util.List;

public class TestCheloveki {
    private List<Employee> emps = Arrays.asList(

            new Employee(1, "Garry", "Berry", 45, Role.SCRUM_MASTER),
            new Employee(2, "Kate", "Gryn", 20, Role.JUNIOR_QA),
            new Employee(3, "Ser", "Green", 23, Role.MANAGER),
            new Employee(4, "Ivan", "Tsymbal", 33, Role.SENIOR_QA),
            new Employee(5, "Anastasiia", "Grey", 34, Role.RM),
            new Employee(6, "Kyrulo", "Toporikov", 33, Role.LEAD_QA)
    );
}
