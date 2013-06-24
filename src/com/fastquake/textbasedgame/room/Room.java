package com.fastquake.textbasedgame.room;

import com.fastquake.textbasedgame.Direction;

public class Room {
	private Door[] doors;
	private int doorCount;
	protected int id;
	
	protected Room(){
		doors = new Door[4]; //Initialize the Door array
		doorCount = 0;
	}
	
	public void describe(){
		System.out.println();
		String doorString = "There is a door to the "; //String to describe the doors
		for(int i=0,k=0;i<4;i++){
			if(doors[i] != null) //If a door occupies this slot (direction)
				k++; //Increment k
			if(k>1){ //If k is greater than 1, then there are multiple doors, so change the door string
				doorString = "There are doors to the ";
				break;
			}
		}
		for(int i=0,appendedDoors=0;i<4;i++){
			String iDir = Direction.values()[i].toString();
			if(doors[i] != null){
				doorString += iDir;
				appendedDoors++;
				if(appendedDoors == doorCount){
					doorString += ".";
					break;
				}else if(doorCount != 2)
					doorString += ", ";
			}
			if(appendedDoors == doorCount-1 && doors[i+1] != null && doorCount != 1){
				if(doorCount == 2)
					doorString += " ";
				doorString += "and ";
			}
		}
		System.out.println(doorString);
		//TODO: Print items
	}
	
	public int getId(){
		return id;
	}
	
	protected void addDoor(Direction direction, int targetId){
		this.doors[direction.ordinal()] = new Door(direction,targetId);
		this.doorCount++;
	}
}
