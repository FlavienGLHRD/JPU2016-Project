package MotionlessElements;

import Elements.Sprite;
import contract.Permeability;

public class Purse extends MotionlessFactory{
	public Purse(){
		super(new Sprite("purse.png"), Permeability.CATCHABLE, 6);
	}

	public int getDbId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
