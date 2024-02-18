package AndersenCourse.lesson_8.phoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook.add("Novak", 789636729);
        PhoneBook.add("Dmitriev", 749336722);
        PhoneBook.add("Evgeniev", 759436729);
        PhoneBook.add("Novak", 989636729);
        PhoneBook.add("Kaluga", 654333987);
        PhoneBook.add("Dombrowski", 686777354);
        PhoneBook.add("Avdeev", 184888333);
        PhoneBook.add("Dmitriev", 686788654);
        PhoneBook.get("NoVaK");
        PhoneBook.get("DmiTriEv");
        PhoneBook.get("Valeychyk");
    }
}
