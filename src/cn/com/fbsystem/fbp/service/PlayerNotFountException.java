package cn.com.fbsystem.fbp.service;

public class PlayerNotFountException extends Exception {
	
	public PlayerNotFountException(){
		super();
	}
	public PlayerNotFountException(String message){
		super(message);
	}
}
