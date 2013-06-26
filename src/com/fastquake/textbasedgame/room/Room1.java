package com.fastquake.textbasedgame.room;

import com.fastquake.textbasedgame.Direction;
import com.fastquake.textbasedgame.gameobject.*;

public class Room1 extends Room {
	Room1(){
		super();
		addDoor(Direction.NORTH,1);
		objects.add(new VentGrate());
		objects.add(new Bed());
		this.id = 1;
	}
	
	public void describe(){
		/*this.roomDescription += "You are standing in a small room. Behind you is ";
		Bed bed = (Bed) this.getObjectByName("bed");
		if(bed.isMade())
			this.roomDescription += "a neatly made bed with sheets and a pillow.";
		else
			this.roomDescription += "an unmade bed with sheets and a pillow";
			*/
		//TODO: Finish this
		System.out.println("You are standing in a small room. Behind you is an unmade bed with sheets and a pillow.\n" +
							"In the corner on the floor, there is a metal grate, probably used for ventilation.\n" +
							"Next to the grate, there is a desk with a drawer. A display screen is embedded into one of the white walls.");
		super.describe();
	}
}
