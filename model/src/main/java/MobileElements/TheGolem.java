package MobileElements;

import Elements.Sprite;

public class TheGolem extends Monster {

	public TheGolem(Sprite Sprite) {
		super(Sprite);
		int i = 1;
		// TODO Auto-generated constructor stub
	}

	private void behavior(int i) {

		int x = getX();
		int y = getY();
		switch (i) {
		case 1:
			MoveUp();
			if (x == getX() && y == getY()) {
				i = 2;
			}
			break;
		case 2:
			MoveRight();
			if (x == getX() && y == getY()) {
				i = 3;
			}
			break;
		case 3:
			MoveDown();
			if (x == getX() && y == getY()) {
				i = 4;
			}
			break;
		case 4:
			MoveUp();
			if (x == getX() && y == getY()) {
				i = 5;
			}
			break;
		case 5:
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
			if (x == getX() && y == getY()) {
				i = 1;
			}
			break;
		}
	}
}