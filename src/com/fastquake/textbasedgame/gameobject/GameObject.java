package com.fastquake.textbasedgame.gameobject;

import java.util.ArrayList;

import com.fastquake.textbasedgame.TextBasedGame;
import com.fastquake.textbasedgame.gameitem.GameItem;

/**
 * Class for Game Objects, which are world features that the player can interact with
 * These are not the same as items, which are things that the player can carry
 * @author Frogging101
 *
 */
public class GameObject{
	protected String examineText;
	protected String name;
	protected String touchText;
	protected String[] otherNames;
	protected String openableName;
	
	protected boolean openable;
	protected boolean open;
	protected boolean examined;
	
	public GameObject(){
		this.examineText = "";
		this.touchText = "";
		this.name = "";
		this.otherNames = new String[0];
	}
	
	public void describe(){
		TextBasedGame.consoleOut(this.examineText);
		if(!examined){
			TextBasedGame.score++;
		}
		examined = true;
	}
	
	/**
	 * Open the object, and if it is a container with items inside, list them
	 */
	public void open(){
		this.open = true;
		TextBasedGame.consoleOut("You open the " + openableName);
	}
	
	public void touch(){
		if(touchText.isEmpty())
			TextBasedGame.consoleOut("Nothing interesting happens.");
		else
			TextBasedGame.consoleOut(touchText);
	}
	
	/**
	 * Returns the names that this object can be referred to as by the player
	 * @return See description
	 */
	public String[] getNames(){
		String[] outStrings = new String[otherNames.length+1];
		outStrings[0] = this.name;
		for(int i=1;i<otherNames.length+1;i++)
			outStrings[i] = this.otherNames[i-1];
		return outStrings;
	}
	
	public void handleCommand(String inputCommand, String object) {
	}
	
	public boolean isOpenable(){
		return this.openable;
	}
	
	public boolean isOpen(){
		return this.open;
	}
}
