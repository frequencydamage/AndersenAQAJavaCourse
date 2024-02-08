package AndersenCourse.lesson_4.parkApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractionList = new ArrayList<>();

    public void displayParkAttractions() {
        System.out.println("List of attractions in particular park: ");
        for (Attraction attraction : attractionList) {
            System.out.println("Attraction: " + attraction.attraction + "\nWorking hours: " + attraction.workHours
                    + "\nPrice: " + attraction.price);
        }
    }

    public void addAttraction(String nameOfAttraction, String workHours, int price) {
        Attraction attraction = new Attraction(nameOfAttraction, workHours, price);
        attractionList.add(attraction);
    }


    private class Attraction {
        private String attraction;
        private String workHours;
        private int price;

        public Attraction(String attraction, String workHours, int price) {
            this.attraction = attraction;
            this.workHours = workHours;
            this.price = price;
        }
    }
}
