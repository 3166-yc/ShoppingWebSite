package com.yc.dao;

import com.yc.po.Product;

import java.util.List;

/**
 * @author yc
 * @create 2019-21-14:57
 */
public interface ProductDao {
    List<Product> select();
    Product selectid(int  product_id);
    int uppdate(Product pro);
    int insert(Product pro);
}
