package org.JavaAutomation.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "joi";
        System.out.println(dayName.toUpperCase());

        switch (dayName.toUpperCase()) {

        case "Luni":
        dayNumber = 1;
        break;

        case "Marti":
        dayNumber = 2;
        break;

        case "Miercuri":
        dayNumber = 3;
        break;

        case "Joi":
        dayNumber = 4;
        break;

        case "Vineri":
        dayNumber = 5;
        break;

        case "Simbata":
        dayNumber = 6;
        break;

        case "Duminica":
        dayNumber = 7;
        break;

        default:
        dayNumber = 0;
        System.out.println("Ai introdus o zi care nu este definita");

    }
    System.out.println("Numarul zilei"+dayName+"este"+dayNumber);
}
}
