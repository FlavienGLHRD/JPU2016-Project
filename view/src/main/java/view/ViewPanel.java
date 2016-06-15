package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *            the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *            the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		int x = 0;

		Image bone = null;
		Image lorann_b = null;
		try {
			bone = ImageIO.read(new File("..//view//sprite//bone.png"));
			lorann_b = ImageIO.read(new File("..//view//sprite//lorann_b.png"));

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		graphics.clearRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.PINK);
		graphics.drawImage(bone, x, 96, viewFrame);
		graphics.drawImage(lorann_b, x, 250, viewFrame);

		for (int i = 0; i < getWidth(); i = i + 32) {
			graphics.drawLine(i, 0, i, getHeight());
		}

		for (int i = 0; i < getHeight(); i = i + 32) {
			graphics.drawLine(0, i, getWidth(), i);
		}

		// graphics.drawString(getViewFrame().getModel().getMessage(), 10, 20);

		/*
		 * graphics.drawImage(bone, 10, 10, viewFrame);
		 *
		 * graphics.drawImage(lorann_bl, 50, y, viewFrame);
		 * graphics.drawImage(lorann_br, 70, y, viewFrame);
		 * graphics.drawImage(lorann_l, 80, y, viewFrame);
		 * graphics.drawImage(lorann_r, 90, y, viewFrame);
		 */
	}
}
