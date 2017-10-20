package cn.com.fbsystem.fbnews.service;

import java.util.List;

import cn.com.fbsystem.fbnews.dao.NewsDao;
import cn.com.fbsystem.fbnews.domain.News;

public class NewsService {
	
	private NewsDao newsdao=new NewsDao();
	/**
	 * 获取所有信息
	 * */
	public News findAllNews(){
		
		return newsdao.findAllNews();
	}
	
	/**
	 * 管理员管理赛事信息
	 * */
	public void AdminNews(News news){
		newsdao.AdminInsertGames(news);
	}
}
