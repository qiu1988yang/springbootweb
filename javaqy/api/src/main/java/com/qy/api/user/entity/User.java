package com.qy.api.user.entity;


import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("user")
@EqualsAndHashCode()
@Data
public class User {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer eodId;
    private String username;
    private String sex;
    private LocalDate birthday;
    private String address;
}
