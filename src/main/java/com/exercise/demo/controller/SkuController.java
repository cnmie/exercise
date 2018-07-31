package com.exercise.demo.controller;

import com.exercise.demo.model.Sku;
import com.exercise.demo.service.SkuService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SkuController {
    @Autowired
    private SkuService skuService;
    //给商品增加Sku
    @RequestMapping(path = {"/add"}, method = {RequestMethod.POST})
    public String addSku(@Param("scolor") String scolor, @Param("ssize") String ssize, @Param("sstyle") String sstyle) {
        System.out.println(scolor);
        Sku sku=new Sku(-1,-1,scolor,ssize,sstyle);
        skuService.addSku(sku);
        return "success";
    }
}
