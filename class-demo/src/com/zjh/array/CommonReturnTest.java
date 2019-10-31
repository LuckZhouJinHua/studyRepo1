package com.zjh.array;

import com.zjh.domain.CommonReturn;

import java.time.LocalDateTime;

public class CommonReturnTest {

    public static void main(String[] args) {
        CommonReturn<Object> commonReturn = new CommonReturn<>();
        commonReturn.ncount=3L;
        commonReturn.message="sssssssuuuuuuuuuuuuu";
        System.out.println(commonReturn.message);
        System.out.println(LocalDateTime.now());
    }
}
