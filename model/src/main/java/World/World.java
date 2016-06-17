package World;

import java.util.ArrayList;

import Elements.Elements;
import MobileElements.Lorann;
import MobileElements.Mobile;

public class World {
	
	private static Object Elements = null;
	private int width;
	private int height;
	
	public World(int width, int height){
		World.Elements= new ArrayList<Elements>();
		
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
		return width;
		
	}
	
	public int getHeight(){
		return height;
	}
	
	public void addElements(int id){
		
	}
	
	public Object getElements(int x,int y){
		return this.Elements;
	}
	
	public void addMobile(Lorann hero,int x,int y){
		
	}
	
	public void addMobile(Mobile mobile,int x,int y){
		
	}
	
	public Elements getElements(){
		return null;
		
	}
	
	public Lorann getHero(){
		return null;
		
	}
	
	public ArrayList<Mobile> getMobile(){
		return null;
		
	}
	
	private void loadFile(String fileName){
		
	}
	
	public void setElements(Elements Elements){
		
	}
	
	public void setHero(Lorann Hero){
		
	}

	public void setMobileHasChanged(){
		
	}
	
	public void notifyObservers(){
		
	}
	
	public void Spell(){
		
	}
	
	public void Monster(){
		
	}
	
}
