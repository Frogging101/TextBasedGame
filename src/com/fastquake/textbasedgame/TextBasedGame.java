package com.fastquake.textbasedgame;

import java.io.*;

import com.fastquake.textbasedgame.room.Room;
import com.fastquake.textbasedgame.room.RoomManager;

public class TextBasedGame {
	public static RoomManager rm;
	static Room currentRoom;
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		boolean doShutdown = false;
		int currentRoomId = 1;
		rm = new RoomManager();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to TextBasedGame.");
		System.out.println("Type \"play\" to start a new game, or \"load\" to load a previous game.");

		while(!doShutdown){
			currentRoom = rm.getRoomById(currentRoomId);
			String command = "";
			
			currentRoom.describe();
			System.out.println();
			System.out.print("> ");
			command = input.readLine();
			handleCommand(command);
		}
	}
	
	private static void handleCommand(String inputCommand){
		inputCommand = inputCommand.toLowerCase(); //Change it to lowercase so that there is no confusion due to case
		String[] splitCommand = inputCommand.split(" ");
		String command = splitCommand[0];
		String object = "";
		
		if(command.equals("north") || command.equals("n")){
			currentRoom = currentRoom.getDoorTarget(Direction.NORTH, rm);
		}else if(command.equals("east") || command.equals("e")){
			currentRoom = currentRoom.getDoorTarget(Direction.EAST, rm);
		}else if(command.equals("south") || command.equals("s")){
			currentRoom = currentRoom.getDoorTarget(Direction.SOUTH, rm);
		}else if(command.equals("west") || command.equals("w")){
			currentRoom = currentRoom.getDoorTarget(Direction.WEST, rm);
		}else if(command.equals("look") || command.equals("examine")){
			if(splitCommand.length>1){
				//TODO: Handle object arguments, also "look at"
			}else
				currentRoom.describe();
		}else if(command.equals("open")){
			//TODO: Open
		}
	}	
}
