package cn.com.fbsystem.user.service;

import cn.com.fbsystem.user.dao.UserDao;
import cn.com.fbsystem.user.domain.User;
import cn.com.fbsystem.user.service.UserException;

public class UserService {

	private UserDao userdao=new UserDao();
	
	public User login(User form) throws UserException{

		/*** 登录功能
		 * @param form
		 * @return
		 * @throws UserException 
		 * 使用username查询得到User
		 * 用户名不存在，密码错误，抛出异常
		 * 返回user
		 * */
		//检验用户名
		User user=userdao.findByUsername(form.getUsername());
		if(user == null) 
			throw new UserException("用户不存在！");
		
		//System.out.println(user.toString());//一旦表单中的user在数据库中不存在，user就为null，引发空指针异常
		//System.out.println(form.toString());
		
		
		 // 一旦表单中的user在数据库中不存在，user就为null，引发空指针异常
		if(!user.getPassw().equals(form.getPassw()))
			throw new UserException("密码错误！");
		return user;
	}
	/**
	 * 注册功能
	 * @param form
	 */
	public void regist(User form) throws UserException{
		
		// 校验用户名
		User user = userdao.findByUsername(form.getUsername());
		if(user != null) throw new UserException("用户名已被注册！");
		
		// 校验email
		user = userdao.findByEmail(form.getEmail());
		if(user != null) throw new UserException("Email已被注册！");
		
		// 插入用户到数据库
		userdao.add(form);
	}
	
}
