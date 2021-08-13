package com.qy.api.user.entity;

import 你自己的父类实体,没有就不用设置!;
import java.time.LocalDate;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-08-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    private String username;

    private String sex;

    private LocalDate birthday;

    private String address;


}
