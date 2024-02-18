import java.time.OffsetDateTime;

public class Testing4Ex {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String year = getYear(date);
        String month = getMonth(date);
        String day = getDay(date);
        String dayOfWeek = getDayOfWeek(date);

        System.out.println(year + " " + month + " " + day + " " + dayOfWeek );
    }

     static String getDayOfWeek(OffsetDateTime date) {
        if(date == null) {
            return null;
        }
        return String.valueOf(date.getDayOfWeek());
    }

     static String getDay(OffsetDateTime date) {
         if(date == null) {
             return null;
         }
        return String.valueOf(date.getDayOfMonth());
    }

     static String getMonth(OffsetDateTime date) {
         if(date == null) {
             return null;
         }
        return String.valueOf(date.getMonth());
    }

     static String getYear(OffsetDateTime date) {
         if(date == null) {
             return null;
         }
        return String.valueOf(date.getYear());
    }
}
