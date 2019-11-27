package com.yc.service;

import com.yc.po.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc
 * @create 2019-21-15:33
 */
@Service
public class ProductserviceImpl implements Productservice{
    @Resource
    Productservice ps;
    public List<Product> select() {
        return ps.select();
    }

    public Product selectid(int product_id) {
        return ps.selectid(product_id);
    }

    public int uppdate(Product pro) {
        return ps.uppdate(pro);
    }

    public int insert(Product pro) {
        return ps.insert(pro);
    }
}
