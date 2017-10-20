package cn.com.fbsystem.fbp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.fbsystem.fbp.domain.Player;
import cn.itcast.jdbc.TxQueryRunner;

public class PlayerDao {
	
	private QueryRunner qr=new TxQueryRunner();
	
	/**
	 * 查询所有球员
	 * 
	 * */
	public List<Player> findAll(){
		
		try {
			String sql="select * from fbp";
			return qr.query(sql, new BeanListHandler<Player>(Player.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 通过国籍查询
	 * */
	public List<Player> findByCountry(String pcountry){
		
		try {
			String sql="select * from fbp where pcountry=?";
			return qr.query(sql, new BeanListHandler<Player>(Player.class),pcountry);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	/*
	 * 通过俱乐部查询球员信息
	 **/
	public List<Player> findByClub(String pclub){
		
		try {
			String sql="select * from fbp where pclub=?";
			return qr.query(sql, new BeanListHandler<Player>(Player.class),pclub);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 通过姓名查询
	 * */
	
	public List<Player> findByName(String pname){
		
		try {
			String sql="select * from fbp where pname=?";
			return qr.query(sql, new BeanListHandler<Player>(Player.class),pname);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	/**
	 * 添加球员
	 * */
	
	public void addPlayer(Player player){
		try{
			String sql="insert into fbp values(?,?,?,?,?,?,?)";
			Object[] params={player.getPid(),player.getPname(),player.getPage(),player.getPcountry(),
					player.getPclub(),player.getPimage(),player.getPposi()};
			qr.update(sql, params);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	/**
	 * 删除球员
	 * @param bid
	 */
	public void delete(String bid) {
		try {
			String sql = "";
			qr.update(sql, bid);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
