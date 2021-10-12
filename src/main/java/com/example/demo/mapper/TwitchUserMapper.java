package com.example.demo.mapper;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.TwitchUser;

/**
 * @author Ho
 */
@DS("two")
public interface TwitchUserMapper extends BaseMapper<TwitchUser> {

}
