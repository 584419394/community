package com.wyc.community.model;

import lombok.Data;

/**
 * @author 武应琛
 * @date 2019/7/22
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
