package com.zjh.test.domain;

import lombok.Data;

/**
 * @author Casual developer
 * @version 1.0
 * @date 2019/8/20/020 14:45
 */

    @Data
    public class User {
        private Long id;
        private String name;
        private Integer age;
        private String email;
    }

