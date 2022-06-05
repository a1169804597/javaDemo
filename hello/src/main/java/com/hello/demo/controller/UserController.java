package com.hello.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
/**
 * Api 类/接口	描述类/接口主要用途
 * ApiOperation 方法    描述方法的用途
 * ApiImplicitParam 方法    用于描述接口的非对象参数
 * ApiImplicitParams 方法    用于描述接口的非对象参数集
 * ApiIgnore 类/方法/参数	Swagger 文档不会显示拥有该注解的接口
 * ApiModel 参数实体类    可设置接口相关实体的描述
 * ApiModelProperty	参数实体类属性	可设置实体属性的相关描述
 */


@Api("用户管理")
@RestController
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @ApiOperation(value = "查询用户信息", notes = "根据用户名查找用户")
    @GetMapping("/{id}")
    public Map<String, Object> findUserById(
            @ApiParam(name = "id", value = "用户id", required = true)@PathVariable("id") int id){
        System.out.println("user id:"+ id);
        HashMap<String, Object> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("userName", "小明");
        return stringStringHashMap;
    }

    @ApiOperation(value = "添加用户", notes = "添加用户的基本信息")
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody Map<String, Object> User){
        HashMap<String, Object> user = new HashMap<>();
        user.put("name", "张三");
        user.put("age", 16);
        return user;
    }
}
