package com.fastquake.textbasedgame.gameobject;

import java.io.BufferedReader;

import com.fastquake.textbasedgame.TextBasedGame;

public class Screen extends GameObject{
	private int passcode;
	private boolean switchedOn;
	private boolean locked;
	
	public Screen(){
		super();
		switchedOn = false;
		this.locked = true;
		this.name = "screen";
		otherNames = new String[]{"touchscreen", "display", "lcd","monitor","tv"};
		this.examineText = "The screen is blank, a small blue light on the bottom right corner emits a pulsating glow.";
		this.passcode = 1236;
	}
	
	public void touch(){
		if(!switchedOn){
			TextBasedGame.consoleOut("You touch the screen, and in the silence of the room you "+
									"can hear the faint buzz as the display comes to life. "+
									"An on-screen keypad pops up from the bottom of the display "+
									"and a dialog box prompting you for a passcode comes in from the top.");
			examineText = "The screen is switched on and displaying a keypad and a passcode prompt. A small green light "+
							"on the bottom right corner glows steadily.";
			switchedOn = true;
			return;
		}
		if(this.locked){
			int inputCode = 0;
			TextBasedGame.consoleOut("The screen is displaying a keypad and a passcode prompt.");
			inputCode = TextBasedGame.getNumericInput("Enter your input: ");
			if(inputCode == this.passcode){
				TextBasedGame.consoleOut("The passcode was correct. A menu is now being displayed.");
				this.locked = false;
			}else{
				TextBasedGame.consoleOut("The passcode was incorrect. The screen continues to display the prompt.");
			}
		}
		if(!this.locked){
			//TODO: Menu
		}
	}
}
