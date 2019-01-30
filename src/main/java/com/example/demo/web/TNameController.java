package com.example.demo.web;
import com.example.demo.core.Wrapper;
import com.example.demo.core.WrapMapper;
import com.example.demo.model.TName;
import com.example.demo.service.TNameService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by Tian Jiguang on 2018/08/28.
*/
@RestController
@RequestMapping("/t/name")
public class TNameController {
    @Resource
    private TNameService tNameService;

    @PostMapping("/add")
    public Wrapper add(TName tName) {
        tNameService.save(tName);
        return WrapMapper.genSuccessResult();
    }

    @PostMapping("/delete")
    public Wrapper delete(@RequestParam Integer id) {
        tNameService.deleteById(id);
        return WrapMapper.genSuccessResult();
    }

    @PostMapping("/update")
    public Wrapper update(TName tName) {
        tNameService.update(tName);
        return WrapMapper.genSuccessResult();
    }

    @PostMapping("/detail")
    public Wrapper detail(@RequestParam Integer id) {
        TName tName = tNameService.findById(id);
        return WrapMapper.genSuccessResult(tName);
    }

    @PostMapping("/list")
    public Wrapper list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TName> list = tNameService.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        return WrapMapper.genSuccessResult(pageInfo);
    }
}
