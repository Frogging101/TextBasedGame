package com.fastquake.textbasedgame.room;

import com.fastquake.textbasedgame.Direction;
import com.fastquake.textbasedgame.TextBasedGame;
import com.fastquake.textbasedgame.room.*;

public class Door {
	private int targetId;
	public boolean locked;
	public int open;
	
	Door(int targetId, boolean locked){
		this.targetId = targetId;
		this.locked = true;
	}
	
	public int getTargetId(){
		return this.targetId;
	}
}
