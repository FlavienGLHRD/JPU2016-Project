package model;

import java.util.ArrayList;
import java.util.Observable;

import MotionlessElements.MotionlessFactory;
import contract.ILorann;
import contract.IMobile;
import contract.IMotionless;
import contract.IWorldEntity;

public class WorldEntity extends Observable implements IWorldEntity{ 
	public IMotionless	elements[][];
	public ArrayList<IMobile>	mobiles;
	private ILorann	lorann;
	public int Xdoor;
	public int Ydoor;


	public WorldEntity(){
		this.elements = new IMotionless[40][40];
		this.mobiles = new ArrayList<IMobile>();
		
	}
	
	
	public void addElement(final IMotionless element, final int x, final int y) {
		if(element == MotionlessFactory.getFromDbId(7)){
			setXdoor(x);
			setYdoor(y);
			System.out.println("XXXXXX");
			System.out.println(getXdoor());
			System.out.println("YYYYYY");
			System.out.println(getYdoor());
		}
		/*System.out.println(element);
			
			System.out.println("XXXXXX");
			System.out.println(getXdoor());
			System.out.println("YYYYYY");
			System.out.println(getYdoor());*/
		
		this.elements[x][y] = element;
		if (element != null) {
			element.setWorldEntity(this);
		}
		this.setChanged();
	}


	public void addMobile(IMobile mobile, int x, int y){
		this.mobiles.add(mobile);
		mobile.setWorldEntity(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	
	public void addLorann(final ILorann lorann, final int x, final int y) {
		this.setLorann(lorann);
		lorann.setX(x);
		lorann.setY(y);
	}

	public void setElements(IMotionless[][] elements) {
		this.elements = elements;
	}
	
	public boolean setElement( IMotionless element, final int x, final int y) {
		this.elements[x][y] = element;
		return true;
	}

	public IMotionless[][] getElements(){
		return this.elements;		
	}

	public IMotionless getElement(final int x, final int y) {
		return this.elements[x][y];
		
	}
	
	public ILorann getLoran(){
		return this.lorann;
	}
	public void setHero(final ILorann lorann) {
		this.lorann = lorann;
		this.setChanged();
	}

	public ArrayList<IMobile> getMobiles(){
		return this.mobiles;
	}

	public int getXdoor() {
		return Xdoor;
	}


	public void setXdoor(int xdoor) {
		Xdoor = xdoor;
	}


	public int getYdoor() {
		return Ydoor;
	}


	public void setYdoor(int ydoor) {
		Ydoor = ydoor;
	}
	
	public void play(){
		for(;;){
			this.setChanged();
			this.notifyObservers();
			/*try{
				Thread.sleep(125);
			} catch (final InterruptedException e){
				e.printStackTrace();
			}
			
			//for (final IMobile mobile : this.mobiles){
				
			//}*/
		}
	}
		

	
	
	public void setMobilehasChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	

	public void notifyObservers(){
		super.notifyObservers();
	}

	public Observable getObservable() {
		return this;
	}

}