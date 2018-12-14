package com.jiahanglee.journey.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiahanglee.journey.dao.ConfessionDao;
import com.jiahanglee.journey.dao.UserDao;
import com.jiahanglee.journey.entity.Confession;
import com.jiahanglee.journey.entity.User;
import com.jiahanglee.journey.services.ConfessionService;
import com.jiahanglee.journey.services.UserService;
import com.jiahanglee.journey.utils.SystemParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
 * @date 2018/10/9 18:04
 * @description //TODO
 */
@Service(value = "confessionService")
public class ConfessionServiceImpl implements ConfessionService {

    @Autowired
    private ConfessionDao confessionDao;
    @Autowired
    SystemParams systemParams;
    @Override
    public Confession selectConfession(Integer id) {
        return confessionDao.selectConfession(id);
    }

    @Override
    public String createConfession(Confession confession) {
        confessionDao.createConfession(confession);
        return systemParams.getWeb_url()+confession.getId();
    }
}


