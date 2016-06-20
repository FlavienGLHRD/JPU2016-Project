package contract;

public interface IMobile extends IElement{

	public int getBddId();

	public int getX() ;
	
	public void setX(int x) ;

	public int getY() ;

	public void setY(int y) ;
	
	public ISprite getSprite() ;

	public void setSprite(ISprite sprite);
	
	//public boolean isMovePossible(final int x, final int y);
	
    //public void moveUp();
	
	/*public void moveDown();
	
	public void moveRight();
	
	public void moveLeft();*/
	
	public IWorldEntity getWorldEntity();

	public void setWorldEntity(final IWorldEntity worldEntity, final int x, final int y) ;

}
