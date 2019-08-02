package com.wyc.community.dto;

import lombok.Data;

/**
 * @author 武应琛
 * @date 2019/7/17
 */

@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
