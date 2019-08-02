package com.wyc.community.mapper;

import com.wyc.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 武应琛
 * @date 2019/7/22
 */
@Mapper
public interface UserMapper {
    @Insert("insert into USER (NAME,ACCOUNT_ID,TOKEN,GMT_CREATE,GMT_MODIFIED,AVATAR_URL) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from USER where TOKEN = #{token}")
    User findByToken(@Param("token") String token);
}
