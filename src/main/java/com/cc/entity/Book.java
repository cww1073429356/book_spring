package com.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: jinjinwen
 * @description: book
 * @date: 2021-01-18 16:26
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer id;
    private String book_code;
    private String book_name;
    private String type_name;
    private Integer book_type;
    private String book_author;
    private String publish_press;
    private Date publish_date;
    private Integer is_borrow;
    private Integer createdByUser;
    private Date createtion;
    private Date last_updatetime;
}
