package com.yc.dao;

import com.yc.po.Product;
import com.yc.po.Status;

import java.util.List;

/**
 * @author yc
 * @create 2019-21-15:29
 */
public interface StatusDao {
    List<Status> select();
    Product selectid(int  status_id);
    int uppdate(Status st);
    int insert(Status st);

}
