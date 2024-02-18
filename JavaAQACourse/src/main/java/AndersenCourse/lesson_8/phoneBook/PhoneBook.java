package AndersenCourse.lesson_8.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private String surname;
    private int phoneNumber;
    private static List<PhoneBook> phoneBookList = new ArrayList<>();

    private PhoneBook(String surname, int phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    static void add(String surname, int phoneNumber) {
        PhoneBook newPerson = new PhoneBook(surname, phoneNumber);
        phoneBookList.add(newPerson);
    }

    static void get(String surname) {
        boolean isFound = false;
        for (PhoneBook person : phoneBookList) {
            if (person.surname.equalsIgnoreCase(surname)) {
                System.out.println("Surname: " + person.surname + " Phone number is: " + person.phoneNumber);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No such person with surname " + surname + " found");
        }
    }
}