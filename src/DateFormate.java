import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormate {

    public  static String   getDateFormate(){
        String formateString = "";

        LocalDate currentDate = LocalDate.now();
        String dayOfWeek = currentDate.getDayOfWeek().name();
        dayOfWeek = dayOfWeek.substring(0,1) + dayOfWeek.substring(1).toLowerCase();

        String month = currentDate.getDayOfWeek().name();
        month = month.substring(0,1) + month.substring(1).toLowerCase();

        int day = currentDate.getDayOfMonth();
        int year = currentDate.getYear();

        formateString = dayOfWeek + ", " +month+ "," +day+ "," +year;


        return formateString;
    }

    public  static String getTime(){
        LocalTime currentTime = LocalTime.now();

        return currentTime.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public static void main(String[] args) {
        DateFormate obj = new DateFormate();
        obj.getDateFormate();
        obj.getTime();
    }

}
