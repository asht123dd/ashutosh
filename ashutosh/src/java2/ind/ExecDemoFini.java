package java2.ind;

//Wait until notepad is terminated.
class ExecDemoFini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {
			p = r.exec("notepad");
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing notepad.");
		}
		System.out.println("Notepad returned " + p.exitValue());
	}

}
