package com.cc.entity;

import com.cc.serializer.JackSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: jinjinwen
 * @description: 实体类
 * @date: 2021-01-12 20:16
 **/


@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
   /* @JsonProperty("t_username")
    private  String username;
    @JsonIgnore
    private  String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private  String phone;
    @JsonSerialize(using = JackSerializer.class)
    private  String address;
    private  Integer userId;*/
    private Integer id;
    private String user_code;
    @JsonIgnore //忽略
    private String password;
    private String email;
    private Integer gender;
    private Date register_time;
    private Date last_logintime;
}
