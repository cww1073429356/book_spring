package com.cc.service.impl;

import com.cc.entity.BookType;
import com.cc.entity.Page;
import com.cc.mapper.UserDAO;
import com.cc.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: jinjinwen
 * @description: impl
 * @date: 2021-01-18 17:13
 **/
@Service
public class BookTypeServiceImpl implements BookTypeService {

    @Override
    public void getTList(Page<BookType> page) {

    }

    @Override
    public BookType getT(Integer id) {
        return null;
    }

    @Override
    public Integer modify(int type, BookType bookType) {
        return null;
    }

    @Override
    public int removeMore(Object... args) {
        return 0;
    }
}
