import javax.swing.*;
import java.awt.*;


public class PaintingApplet extends JApplet {
	public void init() {

		JScrollBar lengthAdjuster = new JScrollBar(JScrollBar.HORIZONTAL, 30, 0, 0, 100);

		JTextField lengthDisplay = new JTextField(3);
		lengthDisplay.setEditable(false);

		JTextField thicknessDisplay = new JTextField(3);
		thicknessDisplay.setEditable(false);

		JButton thicker = new JButton("Thicker");
		JButton thinner = new JButton("Thinner");
		JButton lucky = new JButton("Feeling Lucky?");
		PaintArea paintArea = new PaintArea(lengthAdjuster, thicker, thinner, lucky,
				lengthDisplay, thicknessDisplay);


		setLayout(new BorderLayout());

		add(paintArea, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 1));
		buttonPanel.add(thinner);
		buttonPanel.add(thicknessDisplay);
		buttonPanel.add(thicker);
		buttonPanel.add(lucky);

		add(buttonPanel, BorderLayout.EAST);

		JPanel scrollPanel = new JPanel();
		scrollPanel.add(lengthAdjuster);
		scrollPanel.add(lengthDisplay);

		add(scrollPanel, BorderLayout.SOUTH);
	}
}

