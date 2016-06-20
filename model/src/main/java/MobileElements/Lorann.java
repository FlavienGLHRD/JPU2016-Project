package MobileElements;

import java.awt.Point;

import Elements.Sprite;

public class Lorann extends Mobile{
	private final Point lastPosition;
	
	public Lorann(){
		super(new Sprite("â˜º!"));
		this.lastPosition = new Point();
		this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
	}
	
	private void saveLastPosition() {
		if ((this.lastPosition.getX() != this.getPosition().getX()) || (this.lastPosition.getY() != this.getPosition().getY())) {
			this.lastPosition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}
	
	@Override
	public void MoveUp() {
		this.saveLastPosition();
		super.MoveUp();
	}

	@Override
	public void MoveLeft() {
		this.saveLastPosition();
		super.MoveLeft();
	}

	@Override
	public void MoveDown() {
		this.saveLastPosition();
		super.MoveDown();
	}
	
	@Override
	public void MoveRight() {
		this.saveLastPosition();
		super.MoveRight();
	}

	@Override
	public void MoveUpLeft() {
		this.saveLastPosition();
		super.MoveUpLeft();
	}
	
	@Override
	public void MoveUpRight() {
		this.saveLastPosition();
		super.MoveUpRight();
	}
	
	@Override
	public void MoveDownLeft() {
		this.saveLastPosition();
		super.MoveDownLeft();
	}
	
	@Override
	public void MoveDownRight() {
		this.saveLastPosition();
		super.MoveDownRight();
	}
	
	public void Animate(){
        int number = 0;
		    while (true)       
		     { try              
		        {  
				switch(number)
				{
					case 0:
						new Sprite("lorann_u.png");
						number = number +1;
						Thread.sleep(100);
						 repaint();  
					case 1:
						new Sprite("lorann_ur.png");
							number = number +1;
							Thread.sleep(100);
							 repaint();  
					case 2:
						new Sprite("lorann_r.png");
						number = number +1;
						Thread.sleep(100);
						 repaint();  					
					case 3:
						new Sprite("lorann_br.png");
						number = number +1;
						Thread.sleep(100);
						repaint();  
					case 4:
						new Sprite("lorann_b.png");
						number = number +1;
						Thread.sleep(100);
						repaint();  
					case 5:
						new Sprite("lorann_bl.png");
						number = number +1;
						Thread.sleep(100);
						repaint();  
					case 6:
						new Sprite("lorann_l.png");
						number = number +1;
						Thread.sleep(100);
						repaint();  
					case 7:
						new Sprite("lorann_ul.png");
						number = 0;
						Thread.sleep(100);
						repaint();  
				}
		}
		          
		       catch (InterruptedException e) 
		       { stop();}
		   }
	}
		   

	private void repaint() {
		// TODO Auto-generated method stub
		
	}

	private void stop() {
		// TODO Auto-generated method stub
		
	}

	public void AttractSpell(){
		
	}
	
	public void CastSpell(){
		this.setX(this.lastPosition.x);
		this.setY(this.lastPosition.y);
		super.Spell();
	}

}
