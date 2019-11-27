package com.yc.service;

import com.yc.po.Product;

import java.util.List;

/**
 * @author yc
 * @create 2019-21-15:31
 */
public interface Productservice {
    List<Product> select();
    Product selectid(int  product_id);
    int uppdate(Product pro);
    int insert(Product pro);
}
