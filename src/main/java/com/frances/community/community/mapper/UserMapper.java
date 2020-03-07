package com.frances.community.community.mapper;

import com.frances.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, create_timestamp, update_timestamp) values (#{name},#{accountId},#{token},#{createTimestamp},#{updateTimestamp})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);   // 如果形参是类的化，不需要加注解，不是的话，要加注解
}
