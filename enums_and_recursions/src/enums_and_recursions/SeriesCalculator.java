package enums_and_recursions;
public class SeriesCalculator {
	
	private static int arithmetic(int loops) {
				
		if (loops > 0) {
			return loops + arithmetic(loops - 1);
		} else {
			return 0;
		}
	}
	
	private static int geometric(int loops) {
		if (loops > 0) {
			return 2 * (int)Math.pow(2, loops - 1) + geometric(loops - 1); 
		} else {
			return 0;
		}
	}
	
	private static int fibonacci(int loops) {
		
		return 1 + fibonacciLoop(loops - 1, 0, 1); // first loop uses first two numbers of fibonacci sequence
		
	}
	
	private static int fibonacciLoop(int loops, int numOne, int numTwo) {
		
		int newNum = numOne + numTwo;
		
		if (loops > 0) {
			
			return newNum + fibonacciLoop(loops - 1, numTwo, newNum);
			
		} else {
			
			return 0;
		}
	}
	
	private static int lucas(int loops) {
		
		return 3 + lucasLoop(loops - 1, 2, 1);
	}
	
	private static int lucasLoop(int loops, int numOne, int numTwo) {
		
		int newNum = numOne + numTwo;
		if (loops > 0) {
			return newNum + lucasLoop(loops - 1, numTwo, newNum);
		} else {
			return 0;
		}
	}
	
	
	public static void runSeries(SeriesCategory series, int loops) {
		
		switch(series) {
			case ARITHMETIC:
				FileManager.writeData("Series Type: ARITHMETIC");
				FileManager.writeData(String.format("Num of loops: %d", loops));
				FileManager.writeData("Starts at one, increase by one each time.");
				FileManager.writeData(String.format("Sum: %d", arithmetic(loops)));
				break;
			case GEOMETRIC:
				FileManager.writeData("Series Type: GEOMETRIC");
				FileManager.writeData(String.format("Num of loops: %d", loops));
				FileManager.writeData("Starts at 2, common ratio is 2.");
				FileManager.writeData(String.format("Sum: %d", geometric(loops)));
				break;
			case FIBONACCI:
				FileManager.writeData("Series Type: FIBONACCI");
				FileManager.writeData(String.format("Num of loops: %d", loops));
				FileManager.writeData(String.format("Sum: %d", fibonacci(loops)));
				break;
			case LUCAS:
				FileManager.writeData("Series Type: LUCAS");
				FileManager.writeData(String.format("Num of loops: %d", loops));
				FileManager.writeData(String.format("Sum: %d", lucas(loops)));
		}
	}
	
	
}
