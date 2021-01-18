package com.cc.service;


import com.cc.entity.Page;

public interface IBserService<T> {
    void getTList(Page<T> page);
    T getT(Integer id);
    Integer modify(int type, T t);
     int removeMore(Object... args);
}
