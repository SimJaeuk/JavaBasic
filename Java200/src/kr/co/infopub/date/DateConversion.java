package kr.co.infopub.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConversion {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        int days = (int) (millis / 1000 / 24 / 60 / 60); // 1970.1.1부터 며칠

        Date d = new Date(); // 오늘
        Date dd = new Date(d.getTime() + 24 * 60 * 60 * 1000); // 내일 (하루 후)

        Calendar cal1970 = Calendar.getInstance(); // 오늘
        cal1970.set(1970, 1 - 1, 1);
        System.out.println(d);
        System.out.println(dd);

        Calendar today = Calendar.getInstance();
        long minus = today.getTimeInMillis() - cal1970.getTimeInMillis(); // 현재 - 1970.1.1
        System.out.println(minus);

        // Date를 String으로
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Exception Handling
        String st = sdf.format(dd);
        Date d2 = new Date();

        try {
            d2 = sdf.parse(st);
        } catch (
                ParseException e) {
            System.out.println(d2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
