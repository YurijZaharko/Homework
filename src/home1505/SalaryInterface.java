package home1505;

/**
 * Created by SCIP on 15.06.2016.
 */
public interface SalaryInterface {
    int HOUR_IN_MONTH = 528;
    int getSalaryPer();
    default int salary(int workTime) {
        return workTime * this.getSalaryPer();
    }
}
