package com.github.khins.MathOrder;

// Demo: Operator Precedence
// https://app.pluralsight.com/course-player?clipId=344602b9-98c0-4c78-85e0-c571762ff932
public class MathOrder {

    public static void main(String[] args) {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result);
        System.out.println(result2);
    }
}