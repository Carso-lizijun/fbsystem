package cn.com.fbsystem.ubg.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import cn.com.fbsystem.ubg.domain.Umasks;
import cn.itcast.jdbc.TxQueryRunner;

public class UBGDao {
	private QueryRunner qr=new TxQueryRunner();
	
	/**
	 * 把用户提交的下注信息插入到数据库中
	 * */
	public void addToUBG(Umasks Umasks){
		String sql="insert into usermasks values(?,?,?,?,?,?,?,?,?,?)";
		Object[] params={Umasks.getUsername(),Umasks.getSummasks(),Umasks.getDgame1(),Umasks.getDmask1(),
				Umasks.getDgame2(),Umasks.getDmask2(),Umasks.getDgame3(),Umasks.getDmask3(),
				Umasks.getDgame4(),Umasks.getDmask4()};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
}
