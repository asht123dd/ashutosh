package swing.ind;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Counter extends Frame implements ActionListener {
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;

	public Counter() {
		setLayout(new FlowLayout());
		lblCount = new Label("Counter");
		add(lblCount);
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);
		btnCount = new Button("Count");
		add(btnCount);
		btnCount.addActionListener(this);
		setTitle("AWT Counter");
		setSize(250, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Counter app = new Counter();

	}

	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		++count;
		tfCount.setText(count + " ");
	}

}
