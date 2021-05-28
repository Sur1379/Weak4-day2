package com.company.Weak4Day2;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 20 && sideA > 1) {
            this.sideA = sideA;
        } else {
            System.out.println("Invalid value");
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 20 && sideB > 1) {
            this.sideB = sideB;
        } else {
            System.out.println("Invalid value");
        }

    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC < 20 && sideC > 1) {
            this.sideC = sideC;
        } else {
            System.out.println("Invalid value");
        }

    }

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private int isTriangleValid(Triangle abc) {
        int b1 = 0;
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            b1 = 1;
        }
        return b1;
    }

    public int check(Triangle right) {
        int b2 = 2;
        if (isTriangleValid(right) == 1) {
            if (sideA * sideA + sideB * sideB == sideC * sideC || sideB * sideB + sideC * sideC == sideA * sideA
                    || sideA * sideA + sideC * sideC == sideB * sideB) {
                b2 = 1;
            } else {
                b2 = 0;
            }
        }
        return b2;
    }

    double countSquareOrPerimeter(Triangle abc) {
        int S = (getSideA() + getSideB() + getSideC()) / 2;
        double square = Math.sqrt(S * (S - getSideA()) * (S - getSideB()) *
                (S - getSideC()));
        return square;
    }

    int countSquareOrPerimeter(Triangle abc, int N) {
        int perimeter = getSideA() + getSideB() + getSideC();
        return perimeter;
    }

}
