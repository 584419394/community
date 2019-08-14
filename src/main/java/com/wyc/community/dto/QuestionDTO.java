package com.wyc.community.dto;

import com.wyc.community.model.User;
import lombok.Data;

/**
 * @author 武应琛
 * @date 2019/8/4
 */
@Data
public class QuestionDTO {
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
    private User user;

}
