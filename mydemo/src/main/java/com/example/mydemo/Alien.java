package com.example.mydemo;

public class Alien {
	private int alien_id;
	private String alien_name;
	private String alien_tech;
	
	
	public int getAlien_id() {
		return alien_id;
	}
	public void setAlien_id(int alien_id) {
		this.alien_id = alien_id;
	}
	public String getAlien_name() {
		return alien_name;
	}
	public void setAlien_name(String alien_name) {
		this.alien_name = alien_name;
	}
	public String getAlien_tech() {
		return alien_tech;
	}
	public void setAlien_tech(String alien_tech) {
		this.alien_tech = alien_tech;
	}
	public void show(){
		
		System.out.println("In show!!!");
	}
	
	
	

}
