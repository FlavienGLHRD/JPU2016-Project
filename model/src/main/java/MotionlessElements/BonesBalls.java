package MotionlessElements;

import Elements.Sprite;
import contract.Permeability;

public class BonesBalls extends MotionlessFactory{
	public BonesBalls(){
		super(new Sprite("bone.png"), Permeability.BLOCKING, 3);
	}

	public int getDbId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
