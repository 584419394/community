package com.wyc.community.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 武应琛
 * @date 2019/7/22
 */
@Setter
@Getter
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
