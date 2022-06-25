public abstract class Employees {
    private String name;
    private int id;
    private double salary;
    private String title;
    private String dateOfBirth;
    private String address;

    public Employees(String employeeName, int employeeId, double employeeSalary, String employeeTitle, String employeeDateOfBirth, String employeeAddress) {
        this.name = employeeName;
        this.id = employeeId;
        this.salary = employeeSalary;
        this.title = employeeTitle;
        this.dateOfBirth = employeeDateOfBirth;
        this.address = employeeAddress;
    }

    public void receiveSalary() {
        System.out.println("The salary was sent to the employee bank account");
    }

    public String toString() {
        String txt = String.format("Employee name %s, title: %s, id: %d,date of birth %s, salary %f, address %s", name, title, id, dateOfBirth, salary, address);
        return txt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return title;
    }

    public void setPosition(String position) {
        this.title = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }


    public void Employees(String name, int id, double salary, String title, String dateOfBirth, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

// сначала я сделала такую распечатку. Жалко удалить, закомментировала :)
//    public void printEmployeesDetails() {
//        System.out.println("Employee name is: " + name);
//        System.out.println("Employee id is: " + id);
//        System.out.println("Employee title is: " + title);
//        System.out.println("Employee date of birth is: " + dateOfBirth);
//        System.out.println("Employee salary is: " + salary);
//        System.out.println("Employee address is: " + address);
//        System.out.println("****************************************");
//  }


}
