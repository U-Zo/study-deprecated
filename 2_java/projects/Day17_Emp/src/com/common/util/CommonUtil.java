package com.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {
    public static String getCurrency(int data) {
        //NumberFormat.getCurrencyInstance(Locale.KOREA)���� data��������
        // return format.format(data);
        return null;
    }

    public static String getDate(Date d) {
        //SimpleDateFormat("yyyy-MM-dd")��������  date ��������
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(d);
    }
}
