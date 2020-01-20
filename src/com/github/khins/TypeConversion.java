package com.github.khins;

// Demo: Type Conversion
/// https://app.pluralsight.com/course-player?clipId=f6a44fc5-f5a7-458e-acc3-ae9426e65e4d
public class TypeConversion {

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte  byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        
        short result1 = (short)longVal;
        short result2 = (short)(byteVal - longVal);
        System.out.println("success");
    }
}