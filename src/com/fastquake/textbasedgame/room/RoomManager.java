package com.fastquake.textbasedgame.room;

import java.util.ArrayList;

import com.fastquake.textbasedgame.room.*;

public class RoomManager {
	private ArrayList<Room> rooms;
	
	public RoomManager(){
		rooms = new ArrayList<Room>();
		rooms.add(new Room1());
	}
	
	/**
	 * Searches the Room array for a Room with a certain ID
	 * @param id ID of the Room to retrieve
	 * @return The Room object with that ID
	 */
	public Room getRoomById(int id){
		for(int i=0;i<rooms.size();i++){
			if(rooms.get(i).getId() == id)
				return rooms.get(i);
		}
		return null;
	}
}
