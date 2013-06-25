package com.fastquake.textbasedgame.gameobject;

import com.fastquake.textbasedgame.TextBasedGame;

public class VentGrate extends GameObject{
	boolean electrified;
	
	public VentGrate(){
		this.name = "grate";
		this.openableName = "grate";
		this.openable = true;
		this.otherNames = new String[]{"vent grate", "vent"};
		electrified = true;
		this.examineText = "It's shiny and made of metal. As you approach it, you hear a faint buzzing sound emanating from it.";
	}
	
	public void open(){
		if(electrified){
			System.out.println("You attempt to remove the grate, but it is electrically charged.\n" +
								"A surge of electricity flows through you and you are killed instantly.");
			TextBasedGame.playerDie();
		}else
			super.open();
	}
}
