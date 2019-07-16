package com.wyc.community.dto;

import lombok.Data;

/**
 * @author 武应琛
 * @date 2019/7/15
 */

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
