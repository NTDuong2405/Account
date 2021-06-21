package service.ulti;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeUtil {
    static SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
    public static String convertLongToString(Long timeinMLS){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeinMLS);
        return formatDate.format(calendar.getTime());
    }
}
