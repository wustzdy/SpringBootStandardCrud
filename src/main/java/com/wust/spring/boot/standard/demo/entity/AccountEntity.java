package com.wust.spring.boot.standard.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wust.spring.boot.standard.demo.contant.AccountStatus;
import com.wust.spring.boot.standard.demo.contant.AccountType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName(AccountEntity.TABLE_NAME)
public class AccountEntity extends com.wust.spring.boot.standard.demo.entity.BaseEntity<AccountEntity> {
    public static final String TABLE_NAME = "iam_accounts";

    @TableField
    private String loginName;
    @TableField
    private String description;
    @TableField
    private AccountStatus status;
    @TableField
    private AccountType accountType;
    @TableField
    private Date effectiveDate;
    @TableField
    private Date expirationDate;
}
