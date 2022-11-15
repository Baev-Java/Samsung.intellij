public class Time {
    int hour, min, sec;
    Time(int TimeInSecond) {
        hour = TimeInSecond / 3600;
        TimeInSecond %= 3600;
        min = TimeInSecond / 60;
        sec = TimeInSecond % 60;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }

    public static void main(String[] args) {
        Time time = new Time(182);
        System.out.println(time);
    }
}