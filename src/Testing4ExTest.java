import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Testing4ExTest {


    @Test
    public void get_day_of_week() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = String.valueOf(date.getDayOfWeek());
        String result = Testing4Ex.getDayOfWeek(date);
        assertEquals(expected, result);
    }

    @Test
    public void get_day_of_week_null() {
        String expected = Testing4Ex.getDayOfWeek(null);
        assertNull(expected);
    }

    @Test
    public void get_month_day() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = String.valueOf(date.getDayOfMonth());
        String result = Testing4Ex.getDay(date);
        assertEquals(expected, result);
    }

    @Test
    public void get_day_of_month_null() {
        String expected = Testing4Ex.getMonth(null);
        assertNull(expected);
    }

    @Test
    public void get_month() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = String.valueOf(date.getMonth());
        String result = Testing4Ex.getMonth(date);
        assertEquals(expected, result);

    }

    @Test
    public void get_year() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = String.valueOf(date.getYear());
        String result = Testing4Ex.getYear(date);
        assertEquals(expected, result);

    }


}