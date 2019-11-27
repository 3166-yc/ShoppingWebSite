package com.yc.service;

import com.yc.po.Product;
import com.yc.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yc
 * @create 2019-21-15:33
 */
@Service
public class StatusserviceImpl implements Ststusservice{
    @Resource
    Ststusservice ss;
    public List<Status> select() {
        return ss.select();
    }

    public Product selectid(int status_id) {
        return ss.selectid(status_id);
    }

    public int uppdate(Status st) {
        return ss.uppdate(st);
    }

    public int insert(Status st) {
        return ss.insert(st);
    }
}
