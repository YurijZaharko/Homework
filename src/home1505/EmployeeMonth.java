package home1505;

/**
 * Created by SCIP on 15.06.2016.
 */
public class EmployeeMonth implements SalaryInterface{
    String name;
    int salaryPer;

    public EmployeeMonth(String name, int salaryPerMonth) {
        this.name = name;
        this.salaryPer = salaryPerMonth;
    }
    @Override
    public int getSalaryPer() {
        return salaryPer;
    }

    public int salary(int workTime){
        int month = workTime/SalaryInterface.HOUR_IN_MONTH;
        return getSalaryPer()* month;
    }

}
