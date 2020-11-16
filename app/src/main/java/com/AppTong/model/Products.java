package com.AppTong.model;

public class Products {
    String id;
    Integer productimg;

    public Products(String id, Integer productimg) {
        this.id = id;
        this.productimg = productimg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProductimg() {
        return productimg;
    }

    public void setProductimg(Integer productimg) {
        this.productimg = productimg;
    }
}
