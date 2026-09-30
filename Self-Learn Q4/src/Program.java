
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public boolean isWeekday() {
        return !isWeekend();
    }
}

public class Program {
    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day + " : " + day.isWeekday());
            System.out.println("Weekend : " + day.isWeekend());
            System.out.println();
        }
    }
}