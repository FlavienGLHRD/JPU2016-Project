package World;

import javax.swing.SwingUtilities;

import MobileElements.Lorann;

public class Initialisation {

	private static Play Play = null;
	private World World;

	public Initialisation(){
		this.World = new World();
		this.Play = new Play();
		final Lorann heroes = new Lorann();
		this.World.addMobile(heroes, 15, 15);
		SwingUtilities.invokeLater((Runnable) this);
		this.Play();
	}

	public void Play(){
		this.getPlay().play();
	}
	
	public Play getPlay(){
		return this.Play;
	}
	
	public World getWorld(){
		return this.World;
		
	}
	
	public void Run(){
		
	}
	
}
