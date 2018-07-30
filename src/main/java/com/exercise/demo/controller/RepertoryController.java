package com.exercise.demo.controller;

import com.exercise.demo.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/repertory")
public class RepertoryController {
    @Autowired
    private RepertoryService repertoryService;
    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return repertoryService.findAllRepertory(pageNum,pageSize);
    }

}
