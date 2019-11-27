package me.eastglow.service.impl;

import me.eastglow.mapper.MainMapper;
import me.eastglow.service.MainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MainServiceImpl implements MainService {

    @Resource
    private MainMapper mainMapper;
}
