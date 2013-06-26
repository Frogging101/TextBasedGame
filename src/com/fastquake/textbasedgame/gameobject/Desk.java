package com.fastquake.textbasedgame.gameobject;

public class Desk extends Container{
	public Desk(){
		this.name = "desk";
		this.otherNames = new String[]{"drawer"};
		this.openableName = "drawer";
		this.openable = true;
		this.open = false;
		this.examineText = "It's a metal desk, with a drawer.";
	}
	
	public void open(){
		this.examineText = "It's a metal desk, with a drawer that has been opened.";
		super.open();
	}
}
