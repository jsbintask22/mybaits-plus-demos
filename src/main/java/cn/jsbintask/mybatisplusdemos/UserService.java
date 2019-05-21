package cn.jsbintask.mybatisplusdemos;

import cn.jsbintask.mybatisplusdemos.entity.User;
import cn.jsbintask.mybatisplusdemos.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jsbintask@gmail.com
 * @date 2019/5/21 21:45
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> findUsers() {

    }
}
