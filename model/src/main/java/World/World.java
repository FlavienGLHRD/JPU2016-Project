package World;

import java.util.ArrayList;

import Elements.Elements;
import MobileElements.Lorann;
import MobileElements.Mobile;

public class World {
	
	private static Object Elements = null;
	private static final Object Element = null;
	private static final Mobile Mobile = null;
	private ArrayList<Mobile> mobiles;
	private Object hero;
	
	public World(int width, int height){
		this.mobiles = new ArrayList<Mobile>();
		
	}
	
	public World(){
		this();
		this.width = width;
		this.height = height;
		this.elements = new Element[this.getWidth()][this.getHeight()];

		for (int y = 0; y < this.getHeight(); y++) {
			for (int x = 0; x < this.getWidth(); x++) {
				if ((y == 0) || (y == (height - 1)) || (x == 0) || (x == (width - 1))) {
					this.addElement(MotionlessElements.MotionlessElements.BonesH, x, y);
				} else {
					this.addElement(MotionlessElements.LAND, x, y);
				}
			}
		}
	}
	
	public int getWidth(){
		return getWidth();
		
	}
	
	public int getHeight(){
		return getHeight();
	}
	
	public void addElements(int id){
		int x;
		int y;
		this.Elements = Element;
		if (Element != null) {
			((Elements) Element).setWorld(this);
		}
		this.setMobileHasChanged();
	}
	
	public Object getElements(int x,int y){
		return this.Elements;
	}
	
	public void addMobile(Lorann hero,int x,int y){
		this.setHero(hero);
		this.addMobile((Mobile) hero, x, y);
	}
	
	public void addMobile(Mobile mobile,int x,int y){
		this.mobiles.add(Mobile);
		Mobile.setWorld(this, x, y);
		this.setMobileHasChanged();
		this.notifyObservers();
	}
	
	public Elements getElements(){
		return null;
		
	}
	
	public Lorann getHero(){
		return this.getHero();
		
	}
	
	public ArrayList<Mobile> getMobile(){
		return null;
		
	}
	
	private void loadFile(String fileName){
		
	}
	
	public void setElements(Elements Elements){
		
	}
	
	public void setHero(Lorann Hero){
		this.hero = hero;
		this.setMobileHasChanged();
	}

	public void setMobileHasChanged(){
		this.setMobileHasChanged();
		this.notifyObservers();
	}
	
	public void notifyObservers(){
		super.notifyObservers();
	}
	
	public void Spell(){
		
	}
	
	public void Monster(){
		
	}
	
}
