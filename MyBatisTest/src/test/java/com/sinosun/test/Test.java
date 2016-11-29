package com.sinosun.test;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.sinosun.mstp.mybatis.entity.User;
import com.sinosun.mstp.mybatis.service.IUserService;

public class Test {
	
	private static SqlSessionFactory SESSION_FACTORY = null;
	static{
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			SESSION_FACTORY = new SqlSessionFactoryBuilder().build(reader);
			
		} catch (IOException e) {
			
		}
		
	}
	public static void main(String[] args) {
		SqlSession session = SESSION_FACTORY.openSession();
		
//		 List<User> users = session.selectList("UserMapper.selectUserByName", "root");
	   IUserService userService = session.getMapper(IUserService.class);
//		List<User> users = userService.selectUserByName("benjiazhen"); 
//		System.out.println(JSON.toJSONString(users));
	   User user = new User();
	 
	   user.setName("jwl");
	   user.setPassword("123");
	   int result = userService.addUser(user);
	  System.out.println(result +":"+JSON.toJSONString(user));
//	   int result = userService.updateUser(user);
//	   System.out.println(result);
//	   int result = userService.deleteUser(5);
//	   List<Article> articles = userService.getArticles(3);
//	   System.out.println(JSON.toJSONString(articles));
//	   System.out.println(result);
			   
	   session.commit();
	}

}
