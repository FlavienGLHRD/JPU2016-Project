package contract;

import java.util.ArrayList;
import java.util.Observable;

public interface IWorldEntity {
	public void addElement(final IMotionless element, final int x, final int y);

	public void addMobile(IMobile mobile, int x, int y);

	public void addLorann(final ILorann lorann, final int x, final int y) ;
	
	public ILorann getLorann();
	
	public void setLorann(final ILorann lorann) ;

	public boolean setElement( IMotionless element, final int x, final int y);
	
	public void setElements(IMotionless[][] elements);
	
	public IMotionless[][] getElements();

	public IMotionless getElement(final int x, final int y);
	
	public ArrayList<IMobile> getMobiles();
	
	public int getXdoor();

	public void setXdoor(int xdoor);


	public int getYdoor();


	public void setYdoor(int ydoor);

	public void setMobilehasChanged();
	
	public void notifyObservers();
	
	Observable getObservable();
	
	public void play();
}
