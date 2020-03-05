package com.frances.community.community.mapper;

import com.frances.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, create_timestamp, update_timestamp) values (#{name},#{accountId},#{token},#{createTimestamp},#{updateTimestamp})")
    void insert(User user);
}
