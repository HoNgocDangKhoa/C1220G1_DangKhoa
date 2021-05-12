package com.example.model;

public class Product {
    private int id;
    private String nameProduct;
    private int price;
    private String typeProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, int price, String typeProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.typeProduct = typeProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }
}
