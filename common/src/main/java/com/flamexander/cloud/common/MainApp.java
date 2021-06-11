package com.flamexander.cloud.common;

public class MainApp {
    public static void main(String[] args) {
        ProductDTO p = new ProductDTO (1L, "q", 2);
        System.out.println (p.toString ());
    }
}
