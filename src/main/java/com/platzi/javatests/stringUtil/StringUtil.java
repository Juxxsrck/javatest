package com.platzi.javatests.stringUtil;

public class StringUtil {

    public static boolean isEmpty(String str){
        return str == null || str.trim().length() <= 0;
    }
}
