package com.wyc.community.model;

import lombok.Data;

/**
 * @author 武应琛
 * @date 2019/7/31
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
