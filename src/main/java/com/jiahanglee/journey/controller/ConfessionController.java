package com.jiahanglee.journey.controller;

import com.jiahanglee.journey.entity.Confession;
import com.jiahanglee.journey.services.ConfessionService;
import com.jiahanglee.journey.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @author jiahanglee
 * @version 0.0.1
 * @date 2018/10/9 18:07
 * @description //TODO
 */
@RestController
//@RequestMapping(value = "/user")
public class ConfessionController {

    @Autowired
    private ConfessionService confessionService;

    @GetMapping("/confession/{id}")
    public Object selectConfession(@PathVariable(value = "id",required = false) Integer id){
        return confessionService.selectConfession(id);
    }
    @PostMapping("/confession")
    public String createConfession(Confession confession){
        return confessionService.createConfession(confession);
    }
}


