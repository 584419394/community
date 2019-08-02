package com.wyc.community.mapper;

import com.wyc.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 武应琛
 * @date 2019/7/30
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into QUESTION(title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);
}
