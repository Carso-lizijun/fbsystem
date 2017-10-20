package cn.com.fbsystem.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.com.fbsystem.user.domain.User;
import cn.itcast.jdbc.TxQueryRunner;

public class UserDao {
	private QueryRunner qr=new TxQueryRunner();
	
	/**
	 * 根据用户名查找
	 * */
	public User findByUsername(String username){
		
		try {
			String sql="select * from susers where username=?";
			return qr.query(sql, new BeanHandler<User>(User.class), username);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 根据邮箱查找
	 * */
	
	public User findByEmail(String email){
		
		
		try {
			String sql="select * from susers where email=?";
			return qr.query(sql, new BeanHandler<User>(User.class) , email);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	/**
	 * 插入User
	 * @param user
	 */
	public void add(User user) {
		try {
			String sql = "insert into susers values(?,?,?)";
			Object[] params = {user.getUsername(), user.getPassw(), user.getEmail()};
			qr.update(sql, params);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
