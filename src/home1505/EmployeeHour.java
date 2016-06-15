package home1505;

/**
 * Created by SCIP on 15.06.2016.
 */
public class EmployeeHour implements SalaryInterface{
    String name;
    int salaryPer;

    public EmployeeHour(String name, int salaryPerHour) {
        this.name = name;
        this.salaryPer = salaryPerHour;
    }

    @Override
    public int getSalaryPer() {
        return salaryPer;
    }
}
