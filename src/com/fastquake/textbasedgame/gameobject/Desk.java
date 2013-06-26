package com.fastquake.textbasedgame.gameobject;

public class Desk extends Container{
	public Desk(){
		this.name = "desk";
		this.otherNames = new String[]{"drawer"};
		this.openableName = "drawer";
		this.openable = true;
		this.open = false;
	}
}
