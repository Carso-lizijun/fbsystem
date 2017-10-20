package cn.com.fbsystem.user.domain;

public class User {
	
	/**
	 * Javabean与数据库一致
	 * */
	
	private String username;
	private String passw;
	private String email;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassw() {
		return passw;
	}
	
	public void setPassw(String passw) {
		this.passw = passw;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "username："+username+"password："+passw+"email:"+email;
	}
	
}
