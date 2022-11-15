class GroundhogDate {
    int day;
    String month;
    GroundhogDate(){
        day = 2;
        month = "Feb";
    }
    public String toString() {
        return month + " " + day;
    }

    public static void main(String[] args) {
        GroundhogDate day = new GroundhogDate();
        System.out.println(day);
    }
}