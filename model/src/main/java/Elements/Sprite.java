package Elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.imageio.ImageIO;

public class Sprite extends StringWriter {
	private Image image;

	public Sprite(String string){
		this.write(string);
		try {
			this.image = ImageIO.read(new File("images/" + image));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public Image getImage() {
		return this.image;
	}

}
