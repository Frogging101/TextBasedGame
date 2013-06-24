package com.fastquake.textbasedgame.room;

import com.fastquake.textbasedgame.Direction;

public class Room1 extends Room {
	Room1(){
		super();
		addDoor(Direction.NORTH,1);
		addDoor(Direction.EAST,1);
		addDoor(Direction.WEST,1);
		addDoor(Direction.SOUTH,1);
		this.id = 1;
	}
}
