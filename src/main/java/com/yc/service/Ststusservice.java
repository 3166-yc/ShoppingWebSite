package com.yc.service;

import com.yc.po.Product;
import com.yc.po.Status;

import java.util.List;

/**
 * @author yc
 * @create 2019-21-15:32
 */
public interface Ststusservice {
    List<Status> select();
    Product selectid(int  status_id);
    int uppdate(Status st);
    int insert(Status st);
}
