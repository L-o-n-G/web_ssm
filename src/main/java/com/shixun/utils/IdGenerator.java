package com.shixun.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class  IdGenerator {
    private static SimpleDateFormat format = new SimpleDateFormat("yyMMddHH");
    public static  String getID(){
        String rs = null;
        rs = UUID.randomUUID().toString().replace("-","").substring(9);
        rs = format.format(new Date())+"_"+rs ;
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(getID());
    }
}
