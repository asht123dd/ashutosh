package awt.ind;
import java.awt.*;
@SuppressWarnings("serial")
public class WindowDemo extends Frame{

	/**
	 * 
	 */
	
	WindowDemo()
	{
		Button b=new Button("click me");
		b.setBounds(30, 100, 80, 30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("unused")
WindowDemo d=new WindowDemo();
	}

}
