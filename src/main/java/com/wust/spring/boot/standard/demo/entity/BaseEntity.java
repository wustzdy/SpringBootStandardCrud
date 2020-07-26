package com.wust.spring.boot.standard.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseEntity<T extends BaseEntity<?>> extends Model<T> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField(fill = FieldFill.INSERT)
    private Long ownedById;
    @TableField(fill = FieldFill.INSERT)
    private Long createdById;
    @TableField(fill = FieldFill.UPDATE)
    private Long updatedById;
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
    @TableField(fill = FieldFill.UPDATE)
    private Date updatedTime;
}
