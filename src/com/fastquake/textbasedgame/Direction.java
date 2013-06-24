package com.fastquake.textbasedgame;

public enum Direction {
	NORTH, SOUTH, EAST, WEST;
	
	public String toString(){
		if(this == this.NORTH)
			return "North";
		else if(this == this.EAST)
			return "East";
		else if(this == this.SOUTH)
			return "South";
		else if(this == this.WEST)
			return "West";
		
		return null; //This should never happen
	}
}
