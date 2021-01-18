package com.cc.service.impl;

import com.cc.entity.Book;
import com.cc.mapper.BookDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class) //由SpringJUnit4ClassRunner启动测试
@ContextConfiguration("classpath:spring-context.xml")
public class BookServiceImplTest {
    @Autowired
    private BookServiceImpl bookServiceImpl;
    @Autowired
    @Qualifier("bookDAO")
    private BookDAO bookDAO;
    @Test
    public void getTList() {
    }

    @Test
    public void getT() {
        Book t = bookServiceImpl.getT(1);
        System.out.println(t);

    }

    @Test
    public void modify() {
    }

    @Test
    public void removeMore() {
    }
}