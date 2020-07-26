package com.wust.spring.boot.standard.demo.model;

import com.wust.spring.boot.standard.demo.contant.UserGenderType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Data
public class User {
    private String userName;
    private UserGenderType gender;
    private Date birthday;
}
