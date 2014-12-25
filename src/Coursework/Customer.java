package Coursework;

/**
 * @author lmacha02
 *
 */

public interface Customer {
	
	//variables should be private, declare them in class customer 
	
	public void setStart(int start);
	
	public int getStart();
	
	public void setDestination(int destination);
	
	public int getDestination();
	
	public int getId();
	
	public void setInElevator(boolean status);
	
	public Boolean getInElevator();
	
	public void setFinished();
	
	public Boolean getFinished();
	
	public int getDirection();
	
	public static Customer create(){
		return CustomerImpl.create();
	};
	
}
