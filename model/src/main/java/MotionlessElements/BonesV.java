package MotionlessElements;

import Elements.Sprite;
import contract.Permeability;

public class BonesV extends MotionlessFactory{
	public BonesV(){
		super(new Sprite("vertical_bone.png"), Permeability.BLOCKING, 2);
	}

	public int getDbId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
