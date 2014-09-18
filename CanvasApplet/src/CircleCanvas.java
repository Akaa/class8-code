import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleCanvas extends Canvas implements ActionListener {

	CircleCanvas(JButton larger, JButton smaller) {

		this.larger = larger;
		larger.addActionListener(this);

		this.smaller = smaller;
		smaller.addActionListener(this);

		setSize(100,100);

		setBackground(Color.yellow);
		setVisible(true);
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawOval(upperLeftX, upperLeftY, diameter, diameter);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == larger)
			diameter++;
		else
			diameter--;
		repaint();
	}

	JButton larger, smaller;

	int upperLeftX = 10, upperLeftY = 20, diameter = 10;
}
