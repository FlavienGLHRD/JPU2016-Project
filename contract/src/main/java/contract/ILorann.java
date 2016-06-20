package contract;

public interface ILorann {
public boolean moveUp();
	
	public boolean moveDown();
	
	public boolean moveRight();
	
	public boolean moveLeft();
	
	public boolean moveUpRight();

	public boolean moveUpLeft();

	public boolean moveDownRight();

	public boolean moveDownLeft();

	public boolean isMovePossible(final int x, final int y);
	
	public int getX() ;
	public void setX(int x) ;


	public int getY() ;
	public void setY(int y);

	public void setSprite(ISprite sprite);


	public void setWorldEntity(IWorldEntity worldEntity);


	public void setPermeability(Permeability permeability);

	
	public ISprite getSprite();
	
	public Permeability getPermeability() ;
	
	//public int getAlive();
}
