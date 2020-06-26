package com.wust.spring.boot.crud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sensetime.sensegear.iam.spec.contant.UserGenderType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName(UserEntity.TABLE_NAME)
public class UserEntity extends BaseEntity<UserEntity> {
    public static final String TABLE_NAME = "iam_users";

    @TableField
    private String userName;
    @TableField
    private UserGenderType gender;
    @TableField
    private Date birthday;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserGenderType getGender() {
        return gender;
    }

    public void setGender(UserGenderType gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
