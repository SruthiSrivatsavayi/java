class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
public class Employee extends Person {
    private String employeeId;
    private String jobTitle;
    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Sruthi", "Srivatsavayi", "E12345", "Software Engineer");
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name with Job Title: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
