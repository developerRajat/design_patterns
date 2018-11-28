import java.util.*;

// Subject class which acts as observable
public class Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
		
        public int getState(){
		return state;
        }
	 
	// Changing object state of primary class
 	public void setState(int state){
		this.state = state;
		notifyAllObservers();
	}  

	// Adding new observer
	public void addObserver(Observer observer){
		observers.add(observer);
	}	

	// Deleting observer
	public void deleteObserver(Observer observer){
		observers.remove(observer);
	}

	// Notifying all dependent observers
	public void notifyAllObservers(){
		for(Observer observer: observers){
			observer.update();
		}
	}
	
}