package com.exercise.demo.controller;

import com.exercise.demo.model.Goods;
import com.exercise.demo.model.Relation;
import com.exercise.demo.service.RelationService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/goods")
public class RelationController {
    @Autowired
    private RelationService relationService;
    //查询全部关系
    @RequestMapping(path = {"/all"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String findAllRelation(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "5")
                    int pageSize, HttpServletRequest request, HttpServletResponse response){
        PageInfo<Goods> relations=relationService.findAllRelation(pageNum,pageSize);
        request.setAttribute("relations",relations);
        String type="all?";
        request.setAttribute("type",type);
        return "goods";
    }
    @RequestMapping(path = {"/query"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String queryRelation(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "5")
                    int pageSize, HttpServletRequest request, HttpServletResponse response){
        String condition=request.getParameter("condition");
        PageInfo<Goods> relations=relationService.queryRelation(condition,pageNum,pageSize);
        request.setAttribute("relations",relations);
        String type="query?condition="+condition+"&";
        request.setAttribute("type",type);
        return "goods";
    }
}
