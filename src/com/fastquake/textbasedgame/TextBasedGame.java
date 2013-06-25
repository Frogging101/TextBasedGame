package com.fastquake.textbasedgame;


import java.io.*;

import com.fastquake.textbasedgame.gameobject.GameObject;
import com.fastquake.textbasedgame.room.Room;
import com.fastquake.textbasedgame.room.RoomManager;

public class TextBasedGame {
	public static RoomManager rm;
	private static boolean describedRoom = false;
	static Room currentRoom;
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		boolean doShutdown = false; //TODO: Allow the player to exit
		int currentRoomId = 1;
		rm = new RoomManager();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to TextBasedGame.");
		//System.out.println("Type \"play\" to start a new game, or \"load\" to load a previous game.");
		System.out.println();

		while(!doShutdown){
			currentRoom = rm.getRoomById(currentRoomId);
			String command = "";
			
			if(!describedRoom){ //We don't want to describe the room every time the player
								//uses a command
				currentRoom.describe();
				describedRoom = true;
			}
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
			move(Direction.NORTH);
		}else if(command.equals("east") || command.equals("e")){
			move(Direction.EAST);
		}else if(command.equals("south") || command.equals("s")){
			move(Direction.SOUTH);
		}else if(command.equals("west") || command.equals("w")){
			move(Direction.WEST);
		}else if(command.equals("look") || command.equals("examine") || command.equals("l")){
			if(splitCommand.length>1){
				//TODO: Handle object arguments, also "look at"
			}else
				currentRoom.describe();
		}else if(command.equals("open")){
			GameObject openObject;
			if(splitCommand.length<2)
				System.out.println("Open what?");
			else
			{
				if(splitCommand[1].equals("the")){
					for(int i=2;i<splitCommand.length;i++){
						object += splitCommand[i];
						if(!(i+1>=splitCommand.length))
							object += " ";
					}
				}else{
					for(int i=1;i< splitCommand.length;i++) {
						object += splitCommand[i];
						if(!(i+1 >= splitCommand.length))
							object += " ";
					}
				}
				openObject = currentRoom.getObjectByName(object);
				if(openObject != null){
					if(openObject.isOpenable()){
						openObject.open();
					}else{
						System.out.println("You can't open the " + object);
					}
				}else{
					System.out.println("There is no " + object + " here.");
				}
			}
		}else if(command.startsWith("help")){
			printHelp();
		}else if(command.equals("exit") || command.equals("quit")){
			System.exit(0);
		}
	}
	
	private static void move(Direction direction){
		if(currentRoom.getDoorTarget(direction, rm) != null){ //If there is a door in that direction
			currentRoom = currentRoom.getDoorTarget(direction, rm);
			describedRoom = false;
		}else
			System.out.println("You cannot go that way.");
	}
	
	private static void printHelp(){
		System.out.println("This is a text-based game, which means that you play it by entering text commands.\n" +
							"Available commands include: \n" +
							"help - Displays this text\n"+
							"open - Opens a door or other object\n"+
							"n,e,s,w - Moves you north, east, south or west if possible\n"+
							"exit - Terminates the program");
	}
}
