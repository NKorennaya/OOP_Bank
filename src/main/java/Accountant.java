public class Accountant extends Employees {


    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth, String employeeAddress) {
        super(employeeName, employeeId, Consts.ACCOUNTANT_DEFAULT_SALARY, Consts.ACCOUNTANT_TYPE, employeeDateOfBirth, employeeAddress);
    }

    public void createReport(String accountName) {
        System.out.println("Report Created by " + accountName);
    }
}