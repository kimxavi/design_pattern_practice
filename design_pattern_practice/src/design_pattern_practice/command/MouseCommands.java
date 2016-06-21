package design_pattern_practice.command;

import java.util.ArrayList;
import java.util.List;

public class MouseCommands {
	private List<Command> orderList = new ArrayList<Command>();
	public void takeCommand(Command c){
		orderList.add(c);
	}
	public void placeOrder(){
		for(Command c: orderList){
			c.execute();
		}
		orderList.clear();
	}
}
