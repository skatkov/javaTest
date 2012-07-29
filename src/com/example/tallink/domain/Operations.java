package com.example.tallink.domain;

public class Operations {
	private String name;
	private String description;
	
	public void setName(String name){
		this.name = name; 
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDescription(String desc){
		this.description = desc;
	}
	
	public String getDescription(){
		return this.description;
	}
}
