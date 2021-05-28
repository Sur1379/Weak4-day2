package com.company.Weak4Day2;

public class Task4 {
    public static void main(String[] args) {
        Store store = new Store();
        store.setName("hr");
        System.out.println("Name - " + store.getName());
        int[] arrayProduct = {2516, 2517, 2518, 2519, 2520};
        store.setProductNumber(arrayProduct);
        store.sell(arrayProduct);
    }

}
