package org.example.application.mealsUtil;

enum DaysOfTheWeek {

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String day;

    DaysOfTheWeek(String day) {
        this.day = day;
    }

    String getDay() {
        return this.day;
    }

    static DaysOfTheWeek getDayOfWeek(String dayName) {
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            if (day.getDay().equals(dayName)) {
                return day;
            }
        }
        return null;
    }
}

