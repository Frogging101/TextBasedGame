package com.fastquake.textbasedgame.room;

import com.fastquake.textbasedgame.Direction;

public class Room1 extends Room {
	Room1(){
		super();
		doors[Direction.NORTH.ordinal()] = new Door(Direction.NORTH,2);
		this.id = 1;
	}
}
