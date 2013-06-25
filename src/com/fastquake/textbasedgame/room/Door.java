package com.fastquake.textbasedgame.room;

import com.fastquake.textbasedgame.Direction;
import com.fastquake.textbasedgame.TextBasedGame;
import com.fastquake.textbasedgame.room.*;

public class Door {
	private int targetId;
	private boolean locked;
	
	Door(int targetId, boolean locked){
		this.targetId = targetId;
		this.locked = true;
	}
	
	public void lock(){
		this.locked = true;
	}
	
	public void unlock(){
		this.locked = false;
	}
	
	public boolean isLocked(){
		return this.locked;
	}
	
	public int getTargetId(){
		return this.targetId;
	}
}
