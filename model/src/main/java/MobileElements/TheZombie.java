package MobileElements;

import Elements.Sprite;

public class TheZombie extends Monster {

	public TheZombie(Sprite Sprite) {
		super(Sprite);
		// TODO Auto-generated constructor stub
	}

	public void behavior() {
		int x = getX() - Lorann.getX();
		int y = getY() - Lorann.getY();
		if (x < 0 && y < 0) {
			MoveDownRight();
		} else if (x < 0 && y == 0) {
			MoveRight();
		} else if (x < 0 && y > 0) {
			MoveUpRight();
		} else if (x == 0 && y < 0) {
			MoveDown();
		} else if (x == 0 && y > 0) {
			MoveUp();
		} else if (x > 0 && y < 0) {
			MoveDownLeft();
		} else if (x > 0 && y == 0) {
			MoveLeft();
		} else if (x > 0 && y > 0) {
			MoveUpRight();
		}
	}
}
