package MobileElements;

import java.awt.Point;

import contract.ISprite;
import contract.IWorldEntity;
import contract.Permeability;

import Elements.Elements;
import Elements.Sprite;
import World.World;

public class Mobile extends Elements{
	
	private final int dbId;
	private ISprite sprite;
	protected IWorldEntity worldEntity;
	private int x;
	private int y;
	

	public Mobile(final ISprite sprite, final Permeability permeability, final int dbId, IWorldEntity worldEntity){
	    super(sprite, permeability);
	    this.dbId = dbId;
	    this.worldEntity = worldEntity;
	}

	public int getBddId() {
		return dbId;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
		this.getWorldEntity().setMobilehasChanged();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.getWorldEntity().setMobilehasChanged();
	}
	
	public ISprite getSprite() {
		return sprite;
	}

	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	
	
   /* public void moveUp(){
    	if (getisMovePossible(getX(), getY() - 1)){
    		setY(getY() - 1);
    	}
	}
	/*
	public void moveDown(){
    	if (isMovePossible(getX(), getY() + 1)){
    		setY(getY() + 1);
    	}
	}
	
	public void moveRight(){
    	if (isMovePossible(getX() + 1, getY())){
    		setX(getX() + 1);
    	}
	}
	
	public void moveLeft(){
    	if (isMovePossible(getX() - 1, getY())){
    		setX(getX() - 1);
    	}
	}*/
	
	public IWorldEntity geWorldEntity() {
		return worldEntity;
	}

	public void setWorldEntity(final IWorldEntity worldEntity, final int x, final int y) {
		super.setWorldEntity(worldEntity);;
		this.worldEntity = worldEntity;
		this.setX(x);
		this.setY(y);
	}

}
