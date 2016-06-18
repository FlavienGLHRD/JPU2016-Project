package Elements;

import java.awt.Image;

import World.World;
import aedt.showboard.ISquare;

public class Elements implements ISquare{
	private Sprite sprite;
	private Permeability permeability;
	private World world;

	public Elements(final Sprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public Sprite getSprite() {
		return this.sprite;
	}

	private void setSprite(final Sprite sprite) {
		this.sprite = sprite;		
	}
	public Permeability getPermeability(){
		return this.permeability;
		
	}
	public Permeability setPermeability(Permeability Permeability){
		return this.permeability = Permeability;
		
	}
	public World getWorld(){
		return this.world;
		
	}
	public World setWorld(World World){
		return this.world = World;
		
	}
	public Image getImage(){
		return this.getSprite().getImage();
		
	}

}
