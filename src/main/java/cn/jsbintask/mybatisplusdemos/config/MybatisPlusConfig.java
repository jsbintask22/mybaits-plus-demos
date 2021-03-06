package cn.jsbintask.mybatisplusdemos.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author miemie
 * @since 2018-08-10
 */
@Configuration
@MapperScan("cn.jsbintask.mybatisplusdemos.mapper")
public class MybatisPlusConfig {

}