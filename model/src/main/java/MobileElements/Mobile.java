package MobileElements;

import java.awt.Point;

import Elements.Elements;
import Elements.Permeability;
import Elements.Sprite;
import World.World;

public class Mobile extends Elements{
	
	private static int x;
	private static int y;
	private Point position;
	
	public Mobile(Sprite Sprite){
		super(x, y, null);
		this.position = new Point();
	}
	
	public int getX(){
		return this.position.x;
		
	}
	
	protected void setX(int x){
		if ((x >= 0) && (x < this.getWorld().getWidth())) {
			this.position.x = x;
			this.getWorld().setMobileHasChanged();
	}
	}
	
	public int getY(){
		return this.position.y;
	}
	
	protected void setY(int x){
		if ((y >= 0) && (y < this.getWorld().getHeight())) {
			this.position.y = y;
			this.getWorld().setMobileHasChanged();
		}
	}
	
	public void setWorld(World World,int x,int y){
		super.setWorld(World);
		this.setX(x);
		this.setY(y);
	}
	
	private boolean IsMovePossible(int x,int y){
		return ((Elements) this.getWorld().getElements(x, y)).getPermeability() != Permeability.BLOCKING;
	}
	
	public void MoveUp(){
		if (this.IsMovePossible(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() - 1);
		}
	}
	public void MoveLeft(){
		if (this.IsMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}
	public void MoveDown(){
		if (this.IsMovePossible(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() + 1);
		}
	}
	public void MoveRight(){
		if (this.IsMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
	public void MoveUpLeft(){
		if (this.IsMovePossible(this.getX() -1, this.getY() - 1)) {
			this.setY(this.getY() - 1);
			this.setX(this.getX() - 1);
		}
	}
	public void MoveUpRight(){
		if (this.IsMovePossible(this.getX() +1, this.getY() - 1)) {
			this.setY(this.getY() - 1);
			this.setX(this.getX() + 1);
		}
	}
	public void MoveDownLeft(){
		if (this.IsMovePossible(this.getX() -1, this.getY() + 1)) {
			this.setY(this.getY() + 1);
			this.setX(this.getX() - 1);
		}
	}
	public void MoveDownRight(){
		if (this.IsMovePossible(this.getX() + 1, this.getY() + 1)) {
			this.setY(this.getY() + 1);
			this.setX(this.getX() + 1);
		}
	}
	
	public Point getPosition(){
		return this.position;
	}
	
	//public void Move(){
		
	//}
	
	public void Collision(){
		
	}

}
