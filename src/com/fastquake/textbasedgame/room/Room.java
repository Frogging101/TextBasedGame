package com.fastquake.textbasedgame.room;


public class Room {
	Door[] doors;
	protected int id;
	
	protected Room(){
		doors = new Door[4];
	}
	
	public void describe(){
		//TODO: Write describe() function
	}
	
	public int getId(){
		return id;
	}
}
