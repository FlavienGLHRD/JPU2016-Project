package MotionlessElements;


import Elements.Elements;
import Elements.Sprite;
import contract.IMotionless;
import contract.ISprite;
import contract.Permeability;

public abstract class MotionlessFactory extends Elements implements IMotionless{
private final int dbId;
	
	public MotionlessFactory(final ISprite sprite, final Permeability permeability, final int dbId){
		super(sprite,permeability);
		this.dbId = dbId;
	}

	public int getDbId() {
		return dbId;
	}

}
