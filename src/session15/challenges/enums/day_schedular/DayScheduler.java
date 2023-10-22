package session15.challenges.enums.day_schedular;

import java.util.HashMap;
import java.util.Map;

public class DayScheduler {
    Map<Day, String> schedule = new HashMap<>();

    public void assignActivity(Day day, String activity) {
        schedule.put(day, activity);
    }

    public String getActivity(Day day) {
        return schedule.get(day);
    }

    public void printSchedule() {
        for (Day day : Day.values()) {
            String activity = getActivity(day);
            System.out.println(day + ": " + activity);
        }
    }

    public static void main(String[] args) {
        DayScheduler scheduler = new DayScheduler();
        scheduler.assignActivity(Day.MONDAY, "Go to work at 6AM.");
        scheduler.assignActivity(Day.THUESDAY, "Go to dentist!");

        System.out.println("Day Schedule: ");
        scheduler.printSchedule();
    }
}