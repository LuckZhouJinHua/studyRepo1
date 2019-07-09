package com.zjh.service.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjh.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "dubboxdemo";
    }
}
