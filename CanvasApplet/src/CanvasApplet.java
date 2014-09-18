import javax.swing.*;
import java.awt.*;

public class CanvasApplet extends JApplet {
	public void init() {
		this.setLayout(new FlowLayout());

		JButton larger = new JButton("Larger");
		add(larger);

		JButton smaller = new JButton("Smaller");
		add(smaller);

		add(new CircleCanvas(larger, smaller));
	}
}
/*
 * Things to Explore
 * 
 * Add buttons to move the circle up and down
 * 
 * Add a second canvas that does the same thing as the first canvas, but
 * displays a rectangle rather than a circle (as your starting point you can use
 * either the original applet or the one you modified up/down buttons)
 * 
 * Optional: Usually the canvas subclass listens to the buttons that control its
 * graphic behavior. But: change the structure of the original applet and canvas
 * subclasses so that the -applet- listens to the buttons and informs the canvas
 * (via method calls) of the changes to be made. If you get that working,
 * combine all your work so that you have an applet with a circle canvas and
 * rectangle canvas which BOTH react to the larger/smaller buttons.
 */