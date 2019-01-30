package com.example.demo.service.impl;

import com.example.demo.dao.TNameMapper;
import com.example.demo.model.TName;
import com.example.demo.service.TNameService;
import com.example.demo.core.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Tian Jiguang on 2018/08/28.
 */
@Service
@Transactional
public class TNameServiceImpl extends BaseService<TName> implements TNameService {
    @Resource
    private TNameMapper tNameMapper;

}
