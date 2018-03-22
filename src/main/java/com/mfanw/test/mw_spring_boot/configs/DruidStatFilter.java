package com.mfanw.test.mw_spring_boot.configs;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * <b>Druid配置Filter</b>
 * 
 * @author mengwei
 */
@WebFilter(filterName = "druidWebStatFilter", //
		urlPatterns = "/*", //
		initParams = { //
				@WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
		})
public class DruidStatFilter extends WebStatFilter {

}