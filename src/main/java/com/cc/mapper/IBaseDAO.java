package com.cc.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBaseDAO<T> {
    <T> T getT(@Param("id") Integer id);
    List<T> getList(T t);
    Integer insertT(T t);
    Integer deleteT(T t);
    Integer updataT(T t);
    Integer removeMore(Object... args);
}
