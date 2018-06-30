package generic.ind;

public class GenericMethodTest {
public static <E> void printArray(E[] inputArray)
{
	for(E element:inputArray)
	{
		System.out.printf("%s\t ", element);
	}
	System.out.println();
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] intArray={1,2,3,4,5};
Double[] doubleArray={1.1,2.2,3.3,4.4};
Character[] characterArray={'H','E','L','L','O'};
System.out.println("Integer array contains:");
printArray(intArray);
System.out.println("Double array contains:");
printArray(doubleArray);
System.out.println("Character array contains:");
printArray(characterArray);
	}

}
