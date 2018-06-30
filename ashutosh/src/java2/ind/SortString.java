package java2.ind;

//A bubble sort for Strings.

class SortString {
	static String arr[] = { "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid",
			"of", "their", "country" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			System.out.println(arr[j]);
		}
	}

}
