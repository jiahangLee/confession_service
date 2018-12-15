package com.jiahanglee.journey.controller;

import com.jiahanglee.journey.entity.Confession;
import com.jiahanglee.journey.services.ConfessionService;
import com.jiahanglee.journey.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

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
@CrossOrigin
@RestController
//@RequestMapping(value = "/user")
public class ConfessionController {

    @Autowired
    private ConfessionService confessionService;

    @GetMapping("/confession/{id}")
    public Object selectConfession(@PathVariable(value = "id", required = false) Integer id) {
        return confessionService.selectConfession(id);
    }

    @PostMapping("/confession")
    public String createConfession(@RequestBody Confession confession, HttpServletResponse httpServletResponse) {
        System.out.println(confession.toString());
        String result = confessionService.createConfession(confession);
        Map<String, String> map = new HashMap<>();
        map.put("loveUrl", result);
        return String.valueOf(new JSONObject(map));
//        try {
//            Map<String, String> map = new HashMap<>();
//            map.put("loveUrl", result);
//            PrintWriter writer = httpServletResponse.getWriter();
//            writer.write(String.valueOf(new JSONObject(map)));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}


