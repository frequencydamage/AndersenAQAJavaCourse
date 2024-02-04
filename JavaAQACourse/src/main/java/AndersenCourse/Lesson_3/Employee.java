package AndersenCourse.Lesson_3;

public class Employee {
    String fullName;
    String specialisation;
    String mailAddress;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String specialisation, String mailAddress, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.specialisation = specialisation;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo(Employee employee) {
        System.out.println("Employee fullname: " + fullName + "\nEmployee specialisation: " + specialisation
                + "\nEmployee mail address: " + mailAddress + "\nEmployee phone number: " + phoneNumber
                + "\nEmployee Salary: " + salary + "\nEmployee age: " + age);
        System.out.println("================================");
    }
}
