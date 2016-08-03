package dayThree;

public class Bowling {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {

//			int numberOfBalls = 2;
			int pins = 11;

			int firstRoll = (int) (Math.random() * pins);
			System.out.println(firstRoll);
			if (firstRoll == 10) {
				System.out.println("You Got a Strike!");
				pins = 0;
			} else {
				pins -= firstRoll;
			}

			int secondRoll = (int) (Math.random() * pins);

			System.out.println(secondRoll);

			int frameTotal = (firstRoll + secondRoll);
			System.out.println("Your total: " + frameTotal);
			
//			int gameTotal= frameTotal+=frameTotal;
//			System.out.println("Game Total " +gameTotal);

		}
		
	}
}
