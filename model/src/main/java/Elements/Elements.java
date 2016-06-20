package Elements;

import java.awt.Image;

import World.World;
import aedt.showboard.ISquare;
import contract.IElement;
import contract.ISprite;
import contract.IWorldEntity;
import contract.Permeability;

public class Elements implements IElement{
	private ISprite sprite;
	private Permeability permeability;
	private IWorldEntity lorannWorldEntity;
	private IWorldEntity worldEntity;

	


	public Elements(final ISprite sprite, final Permeability permeability){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}


	public ISprite getSprite() {
		return sprite;
	}


	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}


	public Permeability getPermeability() {
		return permeability;
	}


	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	public IWorldEntity getWorldEntity() {
		return worldEntity;
	}


	public void setWorldEntity(IWorldEntity worldEntity) {
		this.worldEntity = worldEntity;
	}

}