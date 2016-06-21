package Elements;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.imageio.ImageIO;

import contract.ISprite;

public class Sprite implements ISprite{
	private Image image;
	private static final String FILE = "";

	
	public Sprite(final String image){
		try {
			this.image = ImageIO.read(new File("..////view//sprite//" + image));
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	public Image getImage() {
		return this.image;
	}
	
	public static String getFile() {
		return FILE;
	}
}
