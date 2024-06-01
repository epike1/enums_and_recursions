package enums_and_recursions;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);
	
	private static int getInteger(int maximum) {
		
		int choice;
		
		do {
			
			System.out.printf("Enter an integer from 1 to %d: ", maximum);
			try {
				choice = input.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid choice. Must be an integer.");
				input.next();
				continue;
			}
			
			if (choice > 0 && choice <= maximum) {
				return choice;
			}
			
			System.out.printf("Invalid choice. Must be an integer above 0 to %d.", maximum);
			
		} while (true);
		
		
	}
	public static void main(String[] args) {
		
		FileManager.setFile();
		SeriesCategory series = SeriesCategory.ARITHMETIC;
		
		System.out.println("Possible Series:");
		System.out.println("1. Arithmetic");
		System.out.println("2. Geometric");
		System.out.println("3. Fibonacci");
		System.out.println("4. Lucas");
		
		switch (getInteger(4)) {
			
		case 1:
			series = SeriesCategory.ARITHMETIC;
			break;
		case 2:
			series = SeriesCategory.GEOMETRIC;
			break;
		case 3:
			series = SeriesCategory.FIBONACCI;
			break;
		case 4:
			series = SeriesCategory.LUCAS;
			break;
		}
		
		System.out.println("Select the number of loops to go through.");
		
		SeriesCalculator.runSeries(series, getInteger(25));
		
		input.close();
		FileManager.closeWriter();
	}

}
