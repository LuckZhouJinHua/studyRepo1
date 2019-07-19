package com.zjh.domain;

import java.util.List;

public class CommonReturn<T> {
    public Long ncount;
    public List<T> data;
    public String message;
    public Long completed_shops_count;
    public int degree;
}
