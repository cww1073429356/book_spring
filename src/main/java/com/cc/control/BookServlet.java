package com.cc.control;

import com.cc.entity.Book;
import com.cc.entity.Page;
import com.cc.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: jinjinwen
 * @description: book
 * @date: 2021-01-18 19:17
 **/
@Controller
@RequestMapping("/book")
@CrossOrigin("*")
public class BookServlet {
    @Autowired
    private Page<Book> page;
    @Autowired
    private BookServiceImpl bookServiceImpl;

    @ResponseBody
    @RequestMapping("/list")
    List<Book> getlist(Book book) {
        System.out.println(book);
        page.setT(book);
        bookServiceImpl.getTList(page);
        return page.getPageInfo().getList();
    }

    @ResponseBody
    @RequestMapping("/getbookbyid")
    Book getBookById(Integer id) {
        return bookServiceImpl.getT(id);
    }
}
