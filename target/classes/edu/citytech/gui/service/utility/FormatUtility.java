package edu.citytech.gui.service.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatUtility {
    public static String toPercentage(double n, int digits){
        return String.format("%." + digits + "f", n * 100) + "%";
    }

    public static String commaStyle(double n, int digits){
        return String.format("%,." + digits + "f", n);
    }

    public static String formatDate(Date date, String pattern) {
        //= "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String sDate = simpleDateFormat.format(date);
        return sDate;
    }
}
