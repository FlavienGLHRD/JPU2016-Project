package World;

public class Play {
	
	private Object World;

	public void play () {
		this.World = World;
	}
	
	public Play(){
		for (;;) {
			final int key = System.in.read();

			switch (key) {
				case 53:
					this.World.getHero().moveUp();
					break;
				case 51:
					this.World.getHero().moveRight();
					break;
				case 50:
					this.World.getHero().moveDown();
					break;
				case 49:
					this.World.getHero().moveLeft();
					break;
				default:
					break;
			}
		}
	}

}
