package com.kamandemwangi.Currency.Rates.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
@Table(name = "CURRENCY")
public class RateWrapperEntity {

    @SerializedName("base")
    @Expose
    private String base;

    @SerializedName("date")
    @Expose
    private String date;

    @Id
    @SerializedName("timestamp")
    @Expose
    private String timeStamp;

    @SerializedName("rates")
    @Expose
    @OneToOne(cascade = {CascadeType.ALL})
    private RateEntity rates;

    public RateWrapperEntity() {
    }

    public RateWrapperEntity(String base, String date, String timeStamp, RateEntity rates) {
        this.base = base;
        this.date = date;
        this.timeStamp = timeStamp;
        this.rates = rates;
    }


    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public RateEntity getRates() {
        return rates;
    }

    public void setRates(RateEntity rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "RateWrapperEntity{" +
                ", base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", rates=" + rates +
                '}';
    }
}
