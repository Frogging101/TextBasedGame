package com.fastquake.textbasedgame;

import java.io.*;

public class TextBasedGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean doShutdown = false;
		int currentRoom = 0;
		RoomManager rm = new RoomManager();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to TextBasedGame.");
		System.out.println("Type \"play\" to start a new game, or \"load\" to load a previous game.");

		while(!doShutdown){
			
		}
	}

}
