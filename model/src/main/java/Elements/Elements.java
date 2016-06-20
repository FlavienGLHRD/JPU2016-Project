package Elements;

import java.awt.Image;

import World.World;
import jpu2016.world.element.ISprite;
import JPU2016.world.element.Permeability;

public abstract class Elements{
	
	private static final Sprite Sprite;
	private static final World World;
	private Permeability Permeability;
	

	public void Element(final ISprite sprite, final Permeability permeability) {
		this.setSprite((Sprite) sprite);
		this.setPermeability(permeability);
	}
	public Sprite getSprite(){
		return this.Sprite;
	}
	public Sprite setSprite(Sprite Sprite){
		this.Sprite = Sprite;
	}
	public Permeability getPermeability(){
		return this.Permeability;
		
	}
	public Permeability setPermeability(Permeability Permeability){
		this.Permeability = Permeability;
	}
	public World getWorld(){
		return this.World;		
	}
	public World setWorld(World World){
		this.World = World;
		
	}
	public Image getImage(){
		return this.getSprite().getImage();
	}

}
