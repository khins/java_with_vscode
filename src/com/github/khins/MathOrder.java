package com.github.khins;
// Demo: Operator Precedence
//https://app.pluralsight.com/course-player?clipId=344602b9-98c0-4c78-85e0-c571762ff932
public class MathOrder {

    public static void main(final String[] args) {
        int val1 = 21;
        int val2 = 6;
        int val3 = 3;

        int result1 = val1 - val2 / val3;
        int result2 = (val1 - val2) / val3;

        System.out.println(result1);
        System.out.println(result2);
    }
}