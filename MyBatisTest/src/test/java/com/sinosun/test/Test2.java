package com.sinosun.test;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.sinosun.mstp.mybatis.entity.Article;
import com.sinosun.mstp.mybatis.entity.User;
import com.sinosun.mstp.mybatis.service.IUserService;



public class Test2 {
	private static Logger logger = LoggerFactory.getLogger(Test2.class);
	private static ApplicationContext ac;
	static
	{
		ac = new ClassPathXmlApplicationContext("spring-config.xml");
	}
	public static void main(String[] args) {
			IUserService userService = (IUserService)ac.getBean("userService");
			List<User> users = userService.selectUserByName("jwl");
			logger.info(JSON.toJSONString(users));
			List<Article> articles = userService.getArticles(3);
			logger.info(JSON.toJSONString(articles));
	}

}
