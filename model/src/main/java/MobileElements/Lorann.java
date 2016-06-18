package MobileElements;

import java.awt.Point;

import Elements.Sprite;

public class Lorann extends Mobile{
	private final Point lastPosition;
	
	public Lorann(){
		super(new Sprite("â˜º!"));
		this.lastPosition = new Point();
		this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
	}
	
	private void saveLastPosition() {
		if ((this.lastPosition.getX() != this.getPosition().getX()) || (this.lastPosition.getY() != this.getPosition().getY())) {
			this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}
	
	@Override
	public void MoveUp() {
		this.saveLastPosition();
		super.MoveUp();
	}

	@Override
	public void MoveLeft() {
		this.saveLastPosition();
		super.MoveLeft();
	}

	@Override
	public void MoveDown() {
		this.saveLastPosition();
		super.MoveDown();
	}
	
	@Override
	public void MoveRight() {
		this.saveLastPosition();
		super.MoveRight();
	}

	@Override
	public void MoveUpLeft() {
		this.saveLastPosition();
		super.MoveUpLeft();
	}
	
	@Override
	public void MoveUpRight() {
		this.saveLastPosition();
		super.MoveUpRight();
	}
	
	@Override
	public void MoveDownLeft() {
		this.saveLastPosition();
		super.MoveDownLeft();
	}
	
	@Override
	public void MoveDownRight() {
		this.saveLastPosition();
		super.MoveDownRight();
	}
	
	public void Animate(){
		
	}
	
	public void AttractSpell(){
		
	}
	
	public void CastSpell(){
		this.setX(this.lastPosition.x);
		this.setY(this.lastPosition.y);
		super.Spell();
	}
	
}
