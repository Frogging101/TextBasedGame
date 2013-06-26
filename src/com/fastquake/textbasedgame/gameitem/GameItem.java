package com.fastquake.textbasedgame.gameitem;

public class GameItem {
	protected String name;
	protected String[] otherNames;
	
	public String[] getNames(){
		String[] outStrings = new String[otherNames.length+1];
		outStrings[0] = this.name;
		for(int i=1;i<otherNames.length+1;i++)
			outStrings[i] = this.otherNames[i-1];
		return outStrings;
	}
}
