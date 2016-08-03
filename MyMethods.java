package dayThree;

public class MyMethods {

	public static void main(String[] args) {

		boolean doWeHaveAllTheNotebooks = true;
		doWeHaveAllTheNotebooks = false; // went to count the books and missing
											// one
		String whatHappened = notebook(doWeHaveAllTheNotebooks);
		System.out.println(whatHappened);

		andHaveYou();
		butHisBy();
		fromTheyWe();
		saySheWill();
		theyHerWill();
		anOrShe();
	}

	public static String notebook(boolean isLost) {
		String whatToDoNow = null;
		if (isLost) {
			whatToDoNow = "Good, we have all the books";
		} else {
			whatToDoNow = "Ask the students";
		}
		return whatToDoNow;
	}

	private static int andHaveYou() {
		return 7;
	}

	public static char butHisBy() {
		return 'a';
	}

	public static void fromTheyWe() {
	}

	private static int saySheWill() {
		return 4;
	}

	private static double theyHerWill() {
		return 7.78;
	}
	public static void anOrShe(){
		return;
	}
}
