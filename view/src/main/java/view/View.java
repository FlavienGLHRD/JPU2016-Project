package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_NUMPAD4:
				return ControllerOrder.English;
				//this.World.getHero().moveLeft();
			case KeyEvent.VK_NUMPAD6:
				return ControllerOrder.Francais;
				//this.World.getHero().moveRight();
			case KeyEvent.VK_NUMPAD8:
				return ControllerOrder.Deutsch;
				//this.World.getHero().moveUp();
			case KeyEvent.VK_NUMPAD5:
				return ControllerOrder.Indonesia;
				//this.World.getHero().moveDown();
			case KeyEvent.VK_NUMPAD7:
				//this.World.getHero().moveUpLeft();
			case KeyEvent.VK_NUMPAD9:
				//this.World.getHero().moveUpRight();
			case KeyEvent.VK_NUMPAD1:
				//this.World.getHero().moveDownLeft();
			case KeyEvent.VK_NUMPAD3:
				//this.World.getHero().moveDownRight();
			default:
				return ControllerOrder.English;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
