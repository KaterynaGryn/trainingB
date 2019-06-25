import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

  static List<Employee> emps = Arrays.asList(
      new Employee(1, "Borys", "Nazaruk", Role.MANAGER, 3000.00, Company.EPAM),
      new Employee(23, "Kate", "Gryn", Role.RM, 5000.00, Company.CIKLUM),
      new Employee(12, "Kate", "Kashyna", Role.JUNIOR_QA, 1000.00, Company.INFOPULSE)
  );
  public static void main(String[] args) {
      print2nc(emps);
  }

  private static void print(Stream<Employee> listEmployee) {
    listEmployee.map(emp -> String.format("%d  |  %s  | %s   |  %s  |   %.2f   | %s  ",
                                          emp.getId(),
                                          emp.getFirstName(),
                                          emp.getLastName(),
                                          emp.getRole(),
                                          emp.getSalary(),
                                          emp.getCompany()
    )).forEach(System.out::println);


  }
  public static void print2nc(List<Employee> list) {

    for (Employee employee:list
         ) {

      System.out.println(String.format("%d  |  %s  | %s   |  %s  |   %.2f   | %s  ",
                                       employee.getId(),
                                       employee.getFirstName(),
                                       employee.getLastName(),
                                       employee.getRole(),
                                       employee.getSalary(),
                                       employee.getCompany()));
      
    }
  }

}