package com.zjh.dao;

import com.zjh.domain.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemMapper {
    //根据商品id查询商品
    public ItemEntity findById(Integer id);
}
