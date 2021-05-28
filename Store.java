package com.company.Weak4Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    private int countOfWorkers;
    private String name;
    private int phoneNumber;
    private int[] productNumber;

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", productNumber=" + Arrays.toString(productNumber) +
                '}';
    }

    public Store() {
    }

    public Store(int countOfWorkers, String name, int phoneNumber, int[] productNumber) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.productNumber = productNumber;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers < 50 && countOfWorkers > 2) {
            this.countOfWorkers = countOfWorkers;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber > 0) {
            String phone = String.valueOf(phoneNumber);
            if (phone.length() == 8) {
                this.phoneNumber = phoneNumber;
            }
        }

    }

    public int[] getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int[] productNumber) {
        this.productNumber = productNumber;
    }

    void sell(int[] arrayProduct) {
        System.out.println(Arrays.toString(arrayProduct));
        System.out.println("Which product you want ? ");
        int k = 1;
        for (int i = 0; i < arrayProduct.length; i++) {
            System.out.println("For " + arrayProduct[i] + " press ---> " + k);
            k++;
        }
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        switch (k) {
            case 1: {
                System.out.println("Thank you");
            }
            break;
            case 2: {
                System.out.println("Thank you");
            }
            break;
            case 3: {
                System.out.println("Thank you");
            }
            break;
            case 4: {
                System.out.println("Thank you");
            }
            break;
            case 5: {
                System.out.println("Thank you");
            }
            break;
            default: {
                System.out.println("Illegal choice");
            }
        }

    }
}
