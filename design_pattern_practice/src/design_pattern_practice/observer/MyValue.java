package design_pattern_practice.observer;

import java.util.ArrayList;
import java.util.List;

public class MyValue {
	private List<Observer> observerList = new ArrayList<Observer>();
	int state;
	
	public void attach(Observer e){
		observerList.add(e);
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyObserver();
	}
	public void notifyObserver(){
		for(Observer o : observerList){
			o.update();
		}
	}
}
