package com.lalitha.util;

public class IDGen {
    private static int id= 0;
    public static int generateID(){
        return ++id;
    }
}
