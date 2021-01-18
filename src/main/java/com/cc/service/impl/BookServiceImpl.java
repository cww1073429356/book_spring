package com.cc.service.impl;

import com.cc.entity.Book;
import com.cc.entity.Page;
import com.cc.mapper.BookDAO;
import com.cc.mapper.UserDAO;
import com.cc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: jinjinwen
 * @description: imp
 * @date: 2021-01-18 17:13
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAO bookDAO;
    @Override
    public void getTList(Page<Book> page) {

    }

    @Override
    public Book getT(Integer id) {
        return bookDAO.getT(id);
    }

    @Override
    public Integer modify(int type, Book book) {
        return null;
    }

    @Override
    public int removeMore(Object... args) {
        return 0;
    }
}
