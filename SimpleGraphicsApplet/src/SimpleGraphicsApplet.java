import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class SimpleGraphicsApplet extends JApplet {

	public void paint(Graphics g) {
		g.drawLine(0, 0, 100, 100);
		g.setColor(Color.green);
		g.drawRect(10, 30, 20, 60);
		g.setColor(new Color(100, 50, 210));
		g.fillOval(20, 10, 15, 30);
		g.setColor(Color.red);
		g.drawString("Hi There!", 25, 55);

	}
}

/*
 * Things to Explore
 * 
 * Read the Java API documentation for the Graphics class. What sorts of shapes,
 * etc, are available?
 * 
 * Modify this applet so that it draws a smiley face Modify -that- applet so
 * that the face toggles between a smiley and a frown each time paint() is
 * called.
 * 
 * Create an applet that accepts two integer parameters. The first, named
 * quantity, determines the number of circles the applet will draw (you can
 * assume this will be no more than 4). The second parameter, named diameter,
 * gives the diameter of each circle. The circles should be drawn adjacent to
 * each other, touching at the single point. Introduce an init() method and some
 * instance variables to hold the values of the parameters. Note: in Eclipse,
 * under Run->Run Configurations, the Parameters tab will let you list as many
 * parameters as you like. Use the getParameter() method, with the name of the
 * parameter (as a string), to get the value of a given parameter.
 * 
 */