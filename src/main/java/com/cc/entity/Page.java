package com.cc.entity;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jinjinwen
 * @description: page
 * @date: 2021-01-15 19:44
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> {
    private Integer pageNum=1;
    private Integer pageSize=10;
    private PageInfo<T> pageInfo;
    private T t;
}
