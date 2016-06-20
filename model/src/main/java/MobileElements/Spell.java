package MobileElements;

import Elements.Elements;
import Elements.Permeability;
import Elements.Sprite;

public class Spell {
	int number = 0;
	
	
 
	private static Spell INSTANCE = null;
 
	public static Spell getInstance()
	{			
		if (INSTANCE == null)
		{ 	INSTANCE = new Spell();	
		}
		return INSTANCE;
	}
	
	switch(number)
	{
		case 0:
			super(new Sprite("fireball_1.jpg"), Permeability.PENETRABLE, 'e');
			number = number +1;
			break;
		case 1:
			super(new Sprite("fireball_2.jpg"), Permeability.PENETRABLE, 'e');
			number = number +1;
			break;
		case 2:
			super(new Sprite("fireball_3.jpg"), Permeability.PENETRABLE, 'e');
			number = number +1;
			break;
		case 3:
			super(new Sprite("fireball_4.jpg"), Permeability.PENETRABLE, 'e');
			number = number +1;
			break;
		case 4:
			super(new Sprite("fireball_5.jpg"), Permeability.PENETRABLE, 'e');
			number = 0;
			break;
	}
	
	/*public Spell() {
		super(new Sprite("camp.jpg"), Permeability.PENETRABLE, 'C');
	}*/
	
	//private static Singleton;
	
	private void setX (int i ) {
		// TODO Auto-generated method stub
		
	}

	
	private void setY(int i) {
		// TODO Auto-generated method stub
		
	}

	private int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//public static Singleton getInstance(){
		
	//}
	
	private Spell(){
		
	}
	
	public void Animate(){
		
	}
	
	private boolean IsMovePossible(int x,int y){
		return (((Spell) this.getWorld()).getElements(x, y)).getPermeability() != Permeability.PENETRABLE;
	}
	
	private Elements getElements(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Bounce(int getX, int getY ){
		
		if (this.IsMovePossible(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() + 1);
		}
		if (this.IsMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
		if (this.IsMovePossible(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() - 1);
		}
		if (this.IsMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}

}

