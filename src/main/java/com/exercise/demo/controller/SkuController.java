package com.exercise.demo.controller;

import com.exercise.demo.model.Sku;
import com.exercise.demo.service.SkuService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/sku")
public class SkuController {
    @Autowired
    private SkuService skuService;
    //Sku查询全部
    @RequestMapping(path = {"/all"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String findAllSku(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "5")
                    int pageSize, HttpServletRequest request, HttpServletResponse response){
        PageInfo<Sku> skus=skuService.findAllSku(pageNum,pageSize);
        request.setAttribute("skus",skus);
        String type="all?";
        request.setAttribute("type",type);
        return "sku";
    }

    //给商品增加Sku
    @RequestMapping(path = {"/add"}, method = {RequestMethod.POST})
    public String addSku(@Param("gid") int gid,@Param("scolor") String scolor, @Param("ssize") String ssize, @Param("sstyle") String sstyle) {

        Sku sku=new Sku(-1,gid,scolor,ssize,sstyle);
        skuService.addSku(sku);
        return "success";
    }
}
