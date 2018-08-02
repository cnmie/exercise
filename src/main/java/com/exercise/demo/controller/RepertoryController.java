package com.exercise.demo.controller;

import com.exercise.demo.model.Repertory;
import com.exercise.demo.service.RepertoryService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/repertory")
public class RepertoryController {
    @Autowired
    private RepertoryService repertoryService;
    //@ResponseBody
    //@GetMapping("/all")
    //查询全部
    @RequestMapping(path = {"/all"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String findAllRepertory(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "6")
                    int pageSize, HttpServletRequest request, HttpServletResponse response){
        PageInfo<Repertory> repertories=repertoryService.findAllRepertory(pageNum,pageSize);
        request.setAttribute("repertories",repertories);
        String type="all?";
        request.setAttribute("type",type);
        return "repertory";
    }
    //按条件查询
    @RequestMapping(path = {"/query"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String queryRepertory(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "6")
                    int pageSize, HttpServletRequest request, HttpServletResponse response){
        String condition=request.getParameter("condition");
        PageInfo<Repertory> repertories=repertoryService.queryRepertory(condition,pageNum,pageSize);
        request.setAttribute("repertories",repertories);
        String type="query?condition="+condition+"&";
        request.setAttribute("type",type);
        return "repertory";
    }
    //增加仓库
    @RequestMapping(path = {"/add"}, method = {RequestMethod.POST})
    public String addRepertory(@Param("rname")String rname,@Param("raddress")String raddress){
        System.out.println(rname);
        if(rname==""||rname==null){
            return "redirect:all";
        }
        if(raddress==""||raddress==null){
            return "redirect:all";
        }
        Repertory repertory=new Repertory(-1,rname,raddress);
        repertoryService.addRepertory(repertory);
        return "redirect:all";
    }
    //修改仓库信息
    @RequestMapping(path = {"/update"}, method = {RequestMethod.POST})
    public String updateRepertory(@Param("rid")int rid,
                                  @Param("newrname")String newrname,
                                  @Param("newraddress")String newraddress){
        System.out.println(rid);

        Repertory repertory=new Repertory(rid,newrname,newraddress);
        repertoryService.updateRepertory(repertory);
        return "redirect:all";
    }

}
