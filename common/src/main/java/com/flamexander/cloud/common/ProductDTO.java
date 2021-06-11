package com.flamexander.cloud.common;

public class ProductDTO {
    private Long id;
    private String title;
    private int price;

    public ProductDTO(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public ProductDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}