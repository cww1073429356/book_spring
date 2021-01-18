package com.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jinjinwen
 * @description: book_type
 * @date: 2021-01-18 16:25
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookType {
    private Integer id;
    private String type_name;
}
