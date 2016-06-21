package MotionlessElements;

import Elements.Sprite;
import contract.Permeability;

public class EnergyBall extends MotionlessFactory{
	public EnergyBall(){
		super(new Sprite("crystal_ball.png"), Permeability.CATCHABLE, 5);
	}

	public int getDbId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
