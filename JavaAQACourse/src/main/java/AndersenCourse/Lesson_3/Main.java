package AndersenCourse.Lesson_3;

public class Main {
    public static void main(String[] args) {
        //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        //2. Конструктор класса должен заполнять эти поля при создании объекта.
        //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        //4. Создать массив из 5 сотрудников.
        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "Java AQA Specialist",
                "ivan.ivanov@gmail.com", "678-535-729", 5500, 28);
        employeeArray[1] = new Employee("Andreev Andrej Andreevich", "Java Backend Specialist",
                "andrej.andreev@gmail.com", "165-793-652", 7000, 41);
        employeeArray[2] = new Employee("Valevich Anastasiya Dmitrievna", "DevOPS",
                "a.dev@gmail.com", "945-762-888", 5700, 22);
        employeeArray[3] = new Employee("Antonov Anton Antonovich", "C++ Developer",
                "antonchik@gmail.com", "777-375-928", 9000, 45);
        employeeArray[4] = new Employee("Dmitriev Anton Valeryevich", "Sales Manager",
                "dmitriev.sales@gmail.com", "725-983-654", 5500, 28);

        for (Employee employee : employeeArray) {
            if (employee.age > 40) {
                employee.getEmployeeInfo(employee);
            }
        }
    }
}
