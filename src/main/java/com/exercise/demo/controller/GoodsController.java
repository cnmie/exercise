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
    @RequestMapping(path = {"/all"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String findAllRepertory(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize,
            HttpServletRequest request,
            HttpServletResponse response){
        PageInfo<Goods> allGoods=goodsService.findAllGoods(pageNum,pageSize);
        request.setAttribute("allGoods",allGoods);
        String type="all?";
        request.setAttribute("type",type);
        return "goods";
    }
}
