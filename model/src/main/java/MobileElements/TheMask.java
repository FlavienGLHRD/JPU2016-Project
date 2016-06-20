package MobileElements;

import java.util.Random;

import Elements.Sprite;

public class TheMask extends Mobile {

	public TheMask(Sprite Sprite) {
		super(Sprite);
		// TODO Auto-generated constructor stub
	}

	public void behavior() {

		int x = getX() - Lorann.getX();
		int y = getY() - Lorann.getY();
		int d = Math.abs(x) + Math.abs(y);
		if (d <= 5) {
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
		} else {
			Random rand = new Random();
			int r = rand.nextInt(8);
			switch (r) {
			case 0:
				MoveDownRight();
				break;
			case 1:
				MoveRight();
				break;
			case 2:
				MoveUpRight();
				break;
			case 3:
				MoveDown();
				break;
			case 4:
				MoveUp();
				break;
			case 5:
				MoveDownLeft();
				break;
			case 6:
				MoveLeft();
				break;
			case 7:
				MoveUpRight();
				break;

			}
		}

	}
}
