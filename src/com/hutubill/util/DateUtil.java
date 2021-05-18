package com.hutubill.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    long singleday = 11000*60*60*24;

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static java.sql.Date util2sql(java.util.Date d){
        return  new java.sql.Date(d.getTime());
    }

    public static Date getTodayDate(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        Date date = c.getTime();
        return date;

    }




    public static void main(String[] args) {
        System.out.println(DateUtil.getTodayDate());
    }
}
