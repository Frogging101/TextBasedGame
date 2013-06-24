package com.fastquake.textbasedgame;

public enum Direction {
	NORTH, SOUTH, EAST, WEST;
	
	/**
	 * Converts the enumerated compass direction to a human-readable String
	 * @return String, such as "North"
	 */
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
