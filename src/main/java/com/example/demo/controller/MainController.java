package com.example.demo.controller;

import com.example.demo.mapper.BilibiliFolderMapper;
import com.example.demo.mapper.TwitchUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MainController {
    @Resource
    private TwitchUserMapper twitchUserMapper;
    @Resource
    private BilibiliFolderMapper bilibiliFolderMapper;
    @GetMapping("/one")
    public Long one() {
        return twitchUserMapper.selectCount(null);
    }
    @GetMapping("/two")
    public Long two() {
        return bilibiliFolderMapper.selectCount(null);
    }
}
