package cn.jsbintask.mybatisplusdemos.service;

import cn.jsbintask.mybatisplusdemos.entity.User;
import cn.jsbintask.mybatisplusdemos.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author jsbintask@gmail.com
 * @date 2019/5/21 21:45
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> findUsers() {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        Page<User> userPage = new Page<>(1, 10);
        IPage<Map<String, Object>> mapIPage = userMapper.selectMapsPage(userPage, userLambdaQueryWrapper);

        return null;
    }
}
