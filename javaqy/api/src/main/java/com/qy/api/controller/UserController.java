package com.qy.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {



    @GetMapping(value="/login")
    @ResponseBody
    public Map<String,Object> login(String username,String password){

        Map<String,Object> map = new HashMap<>();
        map.put("code", "0000");
        map.put("message", "认证失败");
        return map;

    }


}