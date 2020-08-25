package com.common.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CommonUtil {
    public static String getCurrency(int data) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);

        return nf.format(data);
    }

    public static String getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String getDate(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.format(d.getTime());
    }

    public static Date getDate(String cal) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = sdf.parse(cal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);

        return d;
    }
}
