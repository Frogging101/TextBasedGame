package com.fastquake.textbasedgame.gameobject;

import java.util.ArrayList;

import com.fastquake.textbasedgame.gameitem.GameItem;

public class Container extends GameObject{
	protected ArrayList<GameItem> contains;	
	
	public Container(){
		contains = new ArrayList<GameItem>();
	}
	
	public void addItem(GameItem item){
		contains.add(item);
	}

	public void removeItem(String item){
		for(int i=0;i<contains.size();i++){
			GameItem curItem = contains.get(i);
			for(int j=0;j<curItem.getNames().length;j++){
				if(item.equals(curItem.getNames()[i])){
					//TODO: Remove item and add to inventory
				}
			}
		}
	}
	
	public void open(){
		super.open();
		
		System.out.print("Inside are the following: ");
		int itemCount = contains.size();
		String itemString = "";
		for(int i=0,appended=0;i<contains.size();i++){
			String itemName = contains.get(i).getNames()[0]; 
			if(contains.get(i) != null){
				itemString += itemName;
				appended++;
				if(appended == itemCount){
					itemString += ".";
					break;
				}else if(itemCount != 2) //no commas if there are only 2 items
					itemString += ", ";
			}
			if(appended == itemCount-1 && contains.get(i+1) != null && itemCount != 1){
				if(itemCount == 2) //Without commas there are no spaces, so put one
					itemString += " ";
				itemString += "and ";
			}
		}
		System.out.print(itemString);
	}
}
