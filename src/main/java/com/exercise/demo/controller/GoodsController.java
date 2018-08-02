package com.exercise.demo.controller;

import com.exercise.demo.model.Goods;
import com.exercise.demo.service.GoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    //查询全部
    
}
