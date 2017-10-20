package cn.com.fbsystem.ubg.service;

import cn.com.fbsystem.ubg.dao.UBGDao;
import cn.com.fbsystem.ubg.domain.Umasks;

public class UBGService {
	
	private UBGDao ubgdao=new UBGDao();
	public void insertubg(Umasks umasks){
		ubgdao.addToUBG(umasks);
	}
	
	
}
