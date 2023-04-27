package edu.citytech.gui.service._13fmanager.model;

import java.util.Date;

public class _13FDetails {
    private String id;
    private String stock;
    private String manager;
    private Date reportDate;
    private double value;
    private float valueInBillions;
    private double share;


    public String getId() {
        return id;
    }

    public String getStock() {
        return stock;
    }

    public String getManager() {
        return manager;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public double getValue() {
        return value;
    }

    public float getValueInBillions() {
        return valueInBillions;
    }

    public double getShare() {
        return share;
    }

    @Override
    public String toString() {
        return "_13FDetails{" +
                "id='" + id + '\'' +
                ", stock='" + stock + '\'' +
                ", manager='" + manager + '\'' +
                ", reportDate=" + reportDate +
                ", value=" + value +
                ", valueInBillions=" + valueInBillions +
                ", share=" + share +
                '}';
    }
}