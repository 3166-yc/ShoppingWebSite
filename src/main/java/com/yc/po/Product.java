package com.yc.po;

/**
 * @author yc
 * @create 2019-21-14:48
 */
public class Product {
    private int product_id;
    private String product_name;
    private int product_sum;
    private int product_price;
    private int status_id;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_sum() {
        return product_sum;
    }

    public void setProduct_sum(int product_sum) {
        this.product_sum = product_sum;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public Product() {
    }

    public Product(int product_id, String product_name, int product_sum, int product_price, int status_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_sum = product_sum;
        this.product_price = product_price;
        this.status_id = status_id;
    }
}
