package MobileElements;

import Elements.Elements;
import Elements.Permeability;
import Elements.Sprite;

public abstract class Monster extends Mobile {

	public Monster(Sprite Sprite) {
		super(Sprite);
		// TODO Auto-generated constructor stub
	}

	private boolean IsMovePossible(int x, int y) {
		if (((Elements) getWorld().getElements(x, y)).getPermeability() == Permeability.BLOCKING
				|| ((Elements) getWorld().getElements(x, y)).getPermeability() == Permeability.CATCHABLE) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void MoveUp() {
		if (IsMovePossible(getX(), getY() - 1)) {
			setY(getY() - 1);
		}
	}

	@Override
	public void MoveLeft() {
		if (IsMovePossible(getX() - 1, getY())) {
			setX(getX() - 1);
		}
	}

	@Override
	public void MoveDown() {
		if (IsMovePossible(getX(), getY() + 1)) {
			setY(getY() + 1);
		}
	}

	@Override
	public void MoveRight() {
		if (IsMovePossible(getX() + 1, getY())) {
			setX(getX() + 1);
		}
	}

	@Override
	public void MoveUpLeft() {
		if (IsMovePossible(getX() - 1, getY() - 1)) {
			setY(getY() - 1);
			setX(getX() - 1);
		}
	}

	@Override
	public void MoveUpRight() {
		if (IsMovePossible(getX() + 1, getY() - 1)) {
			setY(getY() - 1);
			setX(getX() + 1);
		}
	}

	@Override
	public void MoveDownLeft() {
		if (IsMovePossible(getX() - 1, getY() + 1)) {
			setY(getY() + 1);
			setX(getX() - 1);
		}
	}

	@Override
	public void MoveDownRight() {
		if (IsMovePossible(getX() + 1, getY() + 1)) {
			setY(getY() + 1);
			setX(getX() + 1);
		}

	}
}
