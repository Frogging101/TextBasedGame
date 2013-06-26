package com.fastquake.textbasedgame.gameobject;

public class Bed extends GameObject {
	private boolean made;
	private boolean removedSheets;
	
	public Bed(){
		this.made = false;
		this.removedSheets = false;
		this.name = "bed";
		this.otherNames = new String[]{"sheets","pillow","bedsheets","bed sheets","duvet","blanket"};
		this.examineText = 	"A soft bed which you recognize as the one you first woke up in.\n" +
							"The duvet and pillow lie untidily on top of it.";
	}
	
	public void handleCommand(String command, String object){
		if(command.equals("make")){
			this.makeBed();
		}else if(command.equals("take") || command.equals("remove")){
			if(!(object.equals("bed"))){
				System.out.println("You remove the duvet and pillow from the bed.");
				this.examineText = 	"A soft bed which you recognize as the one you first woke up in.\n" +
									"The pillow and duvet have been removed.";
				this.removedSheets = true;
			}else{
				System.out.println("The bed is too heavy to take.");
			}
		}
	}
	
	public void makeBed(){
		System.out.println("You make the bed.");
		this.made = true;
		this.examineText =  "A soft, neatly made bed which you recognize as the one you first woke up in.\n";
	}
	
	public boolean isMade(){
		return this.made;
	}
	
	public boolean isSheetsRemoved(){
		return this.removedSheets;
	}
}
