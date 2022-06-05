package com.hello.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("示例")
@RestController
@RequestMapping("/demo")
@ResponseBody
public class DemoController {

    @ApiOperation(value = "查询信息", notes = "查询信息")
    @GetMapping("/show")
    public String show(){
        System.out.println("This is show");
        return "show";
    }




}
