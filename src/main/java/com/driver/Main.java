package com.driver;

public class Main {
    // Change 'product' to 'Product' with a capital 'P'
    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Change 'product' to 'Product' here as well
        Product p = new Product();
        System.out.println(p.product(5, 3));
        System.out.println(p.product(5, 3, 8));
        System.out.println(p.product(5.25, 3.55));
    }
}