package gameobject;

import java.util.ArrayList;
import gameitem.GameItem;

public class GameObject {
	protected String examineText;
	protected String name;
	protected String[] otherNames;
	protected String openableName;
	
	protected boolean openable;
	protected boolean open;
	protected boolean container;
	
	protected ArrayList<GameItem> contains;
	
	public void describe(){
		System.out.println(this.examineText);
	}
	
	public void open(){
		this.open = true;
		System.out.println("You open the " + openableName);
		if(container){
			System.out.print("Inside are the following: ");
			int itemCount = contains.size();
			String itemString = "";
			for(int i=0,appended=0;i<contains.size();i++){
				String itemName = contains.get(i).getName(); 
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
	
	public String[] getNames(){
		String[] outStrings = new String[otherNames.length+1];
		outStrings[0] = this.name;
		for(int i=1;i<otherNames.length;i++)
			outStrings[i] = this.otherNames[i-1];
		return outStrings;
	}
	
	public boolean isOpenable(){
		return this.openable;
	}
	
	public boolean isOpen(){
		return this.open;
	}
}
