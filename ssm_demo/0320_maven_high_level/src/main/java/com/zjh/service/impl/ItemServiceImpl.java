package com.zjh.service.impl;

import com.zjh.dao.ItemMapper;
import com.zjh.domain.ItemEntity;
import com.zjh.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//实现类
@Service
public class ItemServiceImpl implements ItemService {
   @Autowired
    private ItemMapper itemMapper;
    @Override
    public ItemEntity findById(Integer id) {
        return itemMapper.findById(id);
    }
}
