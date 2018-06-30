package awt.ind;
import java.awt.*;
import java.awt.event.*;
public class Counter extends Frame implements ActionListener{
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count=0;
	/**
	 * @param args
	 */
	public Counter()
	{
		setLayout(new FlowLayout());
		lblCount=new Label("Counter");
		add(lblCount);
		tfCount=new TextField("0",10);
		tfCount.setEditable(false);
		add(tfCount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
