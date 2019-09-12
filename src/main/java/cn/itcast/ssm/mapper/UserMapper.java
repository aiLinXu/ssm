package cn.itcast.ssm.mapper;

import cn.itcast.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public interface UserMapper {
    User queryUserById(@Param("id")Long id);
}
