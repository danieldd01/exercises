public class SplitCmd {

	public static void main(String[] args) {
		String value = System.getenv("PATH");
		//System.out.println(value);
		
		String[] parts = value.split(";");
		
		for(String each : parts) {
			System.out.println(each);
		}
	}

