package com.wust.spring.boot.standard.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wust.spring.boot.standard.demo.contant.UserGenderType;
import lombok.Data;

import java.util.Date;

@Data
@TableName(UserEntity.TABLE_NAME)
public class UserEntity {
    public static final String TABLE_NAME = "iam_users";

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "gender")
    private UserGenderType gender;
    @TableField(value = "birthday")
    private Date birthday;

}
