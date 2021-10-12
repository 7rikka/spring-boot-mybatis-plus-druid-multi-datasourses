package com.example.demo.controller;

import com.example.demo.mapper.TwitchUserMapper;
import com.example.demo.pojo.TwitchUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MainController {
    @Resource
    private TwitchUserMapper twitchUserMapper;
    @GetMapping("/")
    public List<TwitchUser> aLong() {
        return twitchUserMapper.selectList(null);
    }
}
