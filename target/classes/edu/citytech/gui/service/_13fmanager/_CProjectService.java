package edu.citytech.gui.service._13fmanager;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.gui.service._13fmanager.model.taxReturn;

import java.net.URL;

public class _CProjectService {
    private final static String URL = "http://localhost:9215/marginalTax/taxPaid?code=$SS&salary=$salary&year=$2021";
    public  static double getReturn(String code, double salary, int year){
        String dynamicURL = URL.replace("$SS", code)
                .replace("$salary", salary + "")
                .replace("$2021", year+"");

        var results = JSONGet.submitGet(dynamicURL, taxReturn.class);
        Double valueReturn = results.getTaxPaid();
        return valueReturn;
    }



}
