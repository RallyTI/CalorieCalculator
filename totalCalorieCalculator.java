import java.util.Scanner;

public class totalCalorieCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float currentWeight, goalWeight;
		int maintanence, bulk, cut;
		int a = 16;
		int b = 18;
		String change = "After a period of a week, your weight will have changed."
				+ "Please come back in seven days and reinput your new weight for your weekly calorie intake!";
		System.out.println("Enter your current weight: ");
		currentWeight = input.nextInt();
		
		bulk = (int)(b*currentWeight-12);
		cut = (int)(a*currentWeight-18);
		
		
		System.out.println("Your current weight is " + currentWeight + ". What is your goal weight?");
		goalWeight = input.nextInt();
		
		if (goalWeight < currentWeight) {
			System.out.println("Your goal is to cut weight, which means you must eat " + cut + " calories per day for a week. " + change);
		}else if (goalWeight > currentWeight) {
			System.out.println("Your goal is to cut weight, which means you must eat " + bulk + " calories per day for a week. " + change);		
		}	else{
			System.out.println("That can't happen stupid. Goodbye.");
		}
	}
}