package AndersenCourse.lesson_4.parkApp;

public class ParkApp {
    //Task 7. Создать класс Park с внутренним классом,
    // с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
    public static void main(String[] args) {
        Park parkOne = new Park();
        parkOne.addAttraction("Karusel", "12:00 - 16:00", 250);
        parkOne.addAttraction("Kolobok", "10:00 - 15:30", 300);
        parkOne.addAttraction("Roller-coaster", "12:00 - 18:00", 430);
        parkOne.displayParkAttractions();
        Park parkTwo = new Park();
        parkTwo.addAttraction("Labyrynth", "12:40 - 19:00", 99);
        parkTwo.addAttraction("Trampoline", "9:00 - 16:00", 70);
        parkTwo.displayParkAttractions();
    }
}
