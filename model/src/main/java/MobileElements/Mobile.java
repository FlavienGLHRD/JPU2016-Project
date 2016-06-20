package MobileElements;

import java.awt.Point;

import Elements.Elements;
import Elements.Permeability;
import Elements.Sprite;
import World.World;

public class Mobile extends Elements {

	private int x;
	private int y;
	private static Point position;

	public Mobile(Sprite Sprite) {
		super();
		position = new Point();
	}

	public static int getX() {
		return position.x;

	}

	protected void setX(int x) {
		if (x >= 0 && x < getWorld().getWidth()) {
			position.x = x;
			getWorld().setMobileHasChanged();
		}
	}

	public static int getY() {
		return position.y;
	}

	protected void setY(int x) {
		if (y >= 0 && y < getWorld().getHeight()) {
			position.y = y;
			getWorld().setMobileHasChanged();
		}
	}

	public void setWorld(World World, int x, int y) {
		super.setWorld(World);
		setX(x);
		setY(y);
	}

	private boolean IsMovePossible(int x, int y) {
		return ((Elements) getWorld().getElements(x, y)).getPermeability() != Permeability.BLOCKING;
	}

	public void MoveUp() {
		if (IsMovePossible(getX(), getY() - 1)) {
			setY(getY() - 1);
		}
	}

	public void MoveLeft() {
		if (IsMovePossible(getX() - 1, getY())) {
			setX(getX() - 1);
		}
	}

	public void MoveDown() {
		if (IsMovePossible(getX(), getY() + 1)) {
			setY(getY() + 1);
		}
	}

	public void MoveRight() {
		if (IsMovePossible(getX() + 1, getY())) {
			setX(getX() + 1);
		}
	}

	public void MoveUpLeft() {
		if (IsMovePossible(getX() - 1, getY() - 1)) {
			setY(getY() - 1);
			setX(getX() - 1);
		}
	}

	public void MoveUpRight() {
		if (IsMovePossible(getX() + 1, getY() - 1)) {
			setY(getY() - 1);
			setX(getX() + 1);
		}
	}

	public void MoveDownLeft() {
		if (IsMovePossible(getX() - 1, getY() + 1)) {
			setY(getY() + 1);
			setX(getX() - 1);
		}
	}

	public void MoveDownRight() {
		if (IsMovePossible(getX() + 1, getY() + 1)) {
			setY(getY() + 1);
			setX(getX() + 1);
		}
	}

	public Point getPosition() {
		return position;
	}

	// public void Move(){

	// }

	public void Collision() {

	}

}
