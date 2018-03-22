package com.mfanw.test.mw_spring_boot.configs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;

/**
 * <b>MybatisPlus配置信息</b>
 * <p>
 * 需要读取配置文件内容进行初始化
 * </p>
 * 
 * @author mengwei
 */
@Configuration
@MapperScan("com.mfanw.test.mw_spring_boot.mapper") // 需要配置该行用以自动将Mapper接口实例化
public class MybatisPlusConfig {
	/*
	 * 分页插件，自动识别数据库类型 多租户，请参考官网【插件扩展】
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

}