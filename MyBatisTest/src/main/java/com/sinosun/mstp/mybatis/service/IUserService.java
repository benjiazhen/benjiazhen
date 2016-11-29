package com.sinosun.mstp.mybatis.service;

import java.util.List;

import com.sinosun.mstp.mybatis.entity.Article;
import com.sinosun.mstp.mybatis.entity.User;

public interface IUserService {
	List<User> selectUserByName(String name);
	int addUser(User user);
	int updateUser(User user);
	int deleteUser(int id);
	List<Article> getArticles(int id);
}
