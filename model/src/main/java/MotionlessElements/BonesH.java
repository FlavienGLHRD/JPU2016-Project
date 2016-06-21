package MotionlessElements;

import Elements.Sprite;
import contract.Permeability;

public class BonesH extends MotionlessFactory{
	public BonesH(){
		super(new Sprite("horizontal_bone.png"), Permeability.BLOCKING, 1);
	}

	public int getDbId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
