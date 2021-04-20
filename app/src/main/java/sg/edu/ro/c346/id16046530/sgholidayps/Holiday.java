package sg.edu.ro.c346.id16046530.sgholidayps;

public class Holiday {
    private String photo;
    private String day;
    private String date;

    public Holiday(String photo, String day, String date) {
        this.photo = photo;
        this.day = day;
        this.date = date;

    }

    public String getPhoto() {
        return photo;
    }

    public String getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }
}
