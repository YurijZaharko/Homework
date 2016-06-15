package home1505;

/**
 * Created by SCIP on 15.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeHour employeeHour = new EmployeeHour("Petro", 2);
        EmployeeMonth employeeMonth = new EmployeeMonth("Sasha", 300);

        System.out.println(employeeHour.salary(2000));
        System.out.println(employeeMonth.salary(2000));
    }
}
