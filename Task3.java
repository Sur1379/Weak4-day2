package com.company.Weak4Day2;

public class Task3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 1);
        if (triangle.check(triangle) == 1) {
            System.out.println("Triangle have right angle");
            System.out.println("Area is - " + triangle.countSquareOrPerimeter(triangle));
        } else if (triangle.check(triangle) == 0) {
            System.out.println("Triangle haven't right angle");
            System.out.println("Perimeter is - " + triangle.countSquareOrPerimeter(triangle, triangle.getSideA()));
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
