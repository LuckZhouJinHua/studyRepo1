package com.zjh.service.impl;

import com.zjh.dao.ItemMapper;
import com.zjh.domain.ItemEntity;
import com.zjh.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper dao;

    @Override
    public ItemEntity findById(Integer id) {
        return dao.findById(id);
    }
}
