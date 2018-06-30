package generic.ind;

import java.util.ArrayList;
import java.util.List;



public class GenericTest2 {

	/**
	 * @param args
	 */
	public static void drawShapes(List<? extends Shape> lists)
	{
		for(Shape s:lists)
		{
			s.draw();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle> list1=new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2=new ArrayList<Circle>();
	}

}
