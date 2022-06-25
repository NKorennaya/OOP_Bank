public class Clerk extends Employees {
    public Clerk(String employeeName, int employeeId, String employeeDateOfBirth, String employeeAddress) {
        super(employeeName, employeeId, Consts.CLERK_DEFAULT_SALARY, Consts.CLERK_TYPE, employeeDateOfBirth, employeeAddress);
    }
    public void makeCall (String clerkName, String customerName){
        System.out.println(String.format("Clerk %s connected to customer %s", clerkName, customerName));
    }

    public void answerCall (String clerkName, String customerName){
        System.out.println(String.format("Clerk %s answered to customer %s", clerkName, customerName));
    }
}
