package com.wust.spring.boot.standard.demo.model;

import com.sensetime.sensegear.iam.spec.contant.UserGenderType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@Data
public class User {
    private String userName;
    private com.sensetime.sensegear.iam.spec.contant.UserGenderType gender;
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
