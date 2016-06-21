package MotionlessElements;

import Elements.Sprite;
import contract.Permeability;

public class Gate extends MotionlessFactory{
	public Gate(){
		super(new Sprite("gate_closed.png"), Permeability.BLOCKING, 4);
	}

	public int getDbId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
