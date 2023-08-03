package com.kamandemwangi.Currency.Rates.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingTimestamp {

    public static String timestamp() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
