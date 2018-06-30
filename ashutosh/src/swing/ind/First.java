package swing.ind;

import javax.swing.*;
import java.awt.*;

public class First {
	JFrame JF;

	public First() {
		JF = new JFrame("MyWindow");
		JButton btn = new JButton("Say Hello");
		JF.add(btn);
		JF.setLayout(new FlowLayout());
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JF.setSize(400, 400);
		JF.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new First();
	}

}
