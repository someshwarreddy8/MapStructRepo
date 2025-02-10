package com.interviewpractice.sample.demo;

public class Product {
    public Long ProductId;
    public String productName;
    public String ProductCategory;
    public double ProductPrice;
    public int ProductStock;
    public long ProductRating;
    public String ProductSupplier;

    public Product(Long productId, String productName, String productCategory, double productPrice, int productStock, long productRating, String productSupplier) {
        ProductId = productId;
        this.productName = productName;
        ProductCategory = productCategory;
        ProductPrice = productPrice;
        ProductStock = productStock;
        ProductRating = productRating;
        ProductSupplier = productSupplier;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public Long getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public int getProductStock() {
        return ProductStock;
    }

    public long getProductRating() {
        return ProductRating;
    }

    public String getProductSupplier() {
        return ProductSupplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", productName='" + productName + '\'' +
                ", ProductCategory='" + ProductCategory + '\'' +
                ", ProductPrice=" + ProductPrice +
                ", ProductStock=" + ProductStock +
                ", ProductRating=" + ProductRating +
                ", ProductSupplier='" + ProductSupplier + '\'' +
                '}';
    }
}
