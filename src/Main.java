import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] arg){

        List<Employee> employeeList = new ArrayList<>(
                Arrays.asList(new Employee(1,"a",100),
                        new Employee(2,"b",200),
                        new Employee(3,"c",300),
                        new Employee(4,"e",400),
                        new Employee(5,"f",500)
                        ) );

        employeeList.stream()
                .filter(employee -> employee.getSal()>300)
                .map(employee -> {

                    int i = (employee.getSal() * 10)/100;
                    employee.setSal(employee.getSal()+i);
                    return employee;
                })
                .map(employee -> {
                    System.out.println(employee.getName());
                    System.out.println(employee.getSal());
                    return employee;
                }).collect(Collectors.toList());
    }
}
