package com.fastquake.textbasedgame.room;

import com.fastquake.textbasedgame.Direction;
import com.fastquake.textbasedgame.TextBasedGame;
import com.fastquake.textbasedgame.gameobject.*;

public class Room1 extends Room {
	Room1(){
		super();
		addDoor(Direction.NORTH,1);
		objects.add(new VentGrate());
		objects.add(new Bed());
		objects.add(new Desk());
		objects.add(new Screen());
		this.id = 1;
	}
	
	public void describe(){
		this.roomDescription += "You are standing in a small room. Behind you is ";
		Bed bed = (Bed) this.getObjectByName("bed");
		VentGrate vent = (VentGrate) this.getObjectByName("grate");
		Desk desk = (Desk) this.getObjectByName("desk");
		if(bed.isMade())
			this.roomDescription += "a neatly made bed with sheets and a pillow. ";
		else
			this.roomDescription += "an unmade bed with sheets and a pillow. ";
		this.roomDescription += "In the corner on the floor, there is ";
		if(vent.isOpen())
			this.roomDescription += "an exposed ventilation shaft with a metal grate resting next to it. ";
		else
			this.roomDescription += "a metal grate, probably used for ventilation. ";
		this.roomDescription += "Next to the vent, there is a desk with a ";
		if(desk.isOpen())
			this.roomDescription += "open ";
		this.roomDescription += "drawer. ";
		this.roomDescription += "A display screen is embedded into one of the white walls.";
		super.describe();
	}
}
