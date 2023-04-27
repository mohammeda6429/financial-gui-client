package edu.citytech.gui.service.utility;

public class FormatUtility {
    public static String toPercentage(double n, int digits){
        return String.format("%." + digits + "f", n * 100) + "%";
    }

    public static String commaStyle(double n, int digits){
        return String.format("%,." + digits + "f", n);
    }
}
