package MobileElements;

import Elements.Sprite;

public class RedHorn extends Monster {

	public RedHorn(Sprite Sprite) {
		super(Sprite);
		// TODO Auto-generated constructor stub
	}

	public void behavior() {
		int x = getX();
		int y = getY();
		MoveLeft();
		if (x == getX() && y == getY()) {
			MoveDown();
		}
		if (x == getX() && y == getY()) {
			MoveRight();
		}
		if (x == getX() && y == getY()) {
			MoveUp();
		}
	}

}
