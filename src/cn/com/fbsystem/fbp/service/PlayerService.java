package cn.com.fbsystem.fbp.service;

import java.util.List;

import cn.com.fbsystem.fbp.dao.PlayerDao;
import cn.com.fbsystem.fbp.domain.Player;

public class PlayerService {
	private PlayerDao playerdao=new PlayerDao();
	
	/**
	 * 查询所有球员
	 * */
	public List<Player> findAll(){
		return playerdao.findAll();
	}
	
	/**
	 * 按国籍查询
	 * @throws PlayerNotFountException 
	 * */
	public List<Player> findByCountry(String pcountry) throws PlayerNotFountException{
		if((playerdao.findByCountry(pcountry)).size()==0){
			throw new PlayerNotFountException("不存在这个国家的球员");
		}
		else return playerdao.findByCountry(pcountry);	
	}
	
	/**
	 * 按俱乐部查询
	 * @throws PlayerNotFountException 
	 * */
	public List<Player> findByClub(String pclub) throws PlayerNotFountException{
		if((playerdao.findByClub(pclub)).size()==0){
			throw new PlayerNotFountException("不存在这个俱乐部的球员");
		}
		else return playerdao.findByClub(pclub);	
	}
	
	/**
	 * 按名称查询
	 * @throws PlayerNotFountException 
	 * */
	public List<Player> findByName(String pname) throws PlayerNotFountException{
		if((playerdao.findByName(pname)).size()==0){
			throw new PlayerNotFountException("不存在这个球员");
		}
		else return playerdao.findByName(pname);	
	}
	
	/**
	 * 添加球员
	 * */
	public void addPlayer(Player player){
		playerdao.addPlayer(player);
		
	}
	
}
