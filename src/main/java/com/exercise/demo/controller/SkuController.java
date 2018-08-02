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
            @RequestParam(name = "pageSize", required = false, defaultValue = "6")
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
        return "redirect:all";
    }
    //修改商品Sku
    @RequestMapping(path = {"/update"}, method = {RequestMethod.POST})
    public String updateSku(@Param("sid")int sid,
                                  @Param("newscolor")String newscolor,
                                  @Param("newssize")String newssize,
                                  @Param("newsstyle")String newsstyle){
        System.out.println(sid);
        Sku sku=new Sku(sid,-1,newscolor,newssize,newsstyle);
        skuService.updateSku(sku);
        return "redirect:all";
    }
    //按条件查询
    @RequestMapping(path = {"/query"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String querySku(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "6")
                    int pageSize, HttpServletRequest request, HttpServletResponse response){
        String condition=request.getParameter("condition");
        PageInfo<Sku> skus= skuService.querySku(condition,pageNum,pageSize);
        request.setAttribute("skus",skus);
        String type="query?condition="+condition+"&";
        request.setAttribute("type",type);
        return "sku";
    }
}
