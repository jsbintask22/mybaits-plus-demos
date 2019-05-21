package cn.jsbintask.mybatisplusdemos.mapper;

import cn.jsbintask.mybatisplusdemos.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jsbintask@gmail.com
 * @date 2019/5/21 21:44
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
