package cn.com.fbsystem.fbnews.dao;

import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import cn.com.fbsystem.fbnews.domain.News;
import cn.itcast.jdbc.TxQueryRunner;

public class NewsDao {
	
	private QueryRunner qr=new TxQueryRunner();
	
	/**
	 * 一次性获取所有的赛事信息，因为只有一个JavaBean
	 * */
	public News findAllNews(){
		
		try {
			String sql="select * from fbnewinfo";
			return qr.query(sql, new BeanHandler<News>(News.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 管理员更新赛事信息
	 * */
	public void AdminInsertGames(News news){
		String sql="update fbnewinfo set time1=?,time2=?,time3=?,time4=?," +
				"gameproperty1=?,gameproperty2=?,gameproperty3=?,gameproperty4=?," +
				"teamname1=?,teamname2=?,teamname3=?,teamname4=?," +
				"teamname5=?,teamname6=?,teamname7=?,teamname8=?";
		try{
			Object[] params={news.getTime1(),news.getTime2(),news.getTime3(),news.getTime4(),
					news.getGameproperty1(),news.getGameproperty2(),news.getGameproperty3(),news.getGameproperty4(),
					news.getTeamname1(),news.getTeamname2(),news.getTeamname3(),news.getTeamname4(),
					news.getTeamname5(),news.getTeamname6(),news.getTeamname7(),news.getTeamname8()};
			qr.update(sql, params);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
}
