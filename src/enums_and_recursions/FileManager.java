package enums_and_recursions;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileManager {
	
	private static File textFile = new File("src/text_data.txt");
	private static BufferedWriter writer;
	
	public static void setFile() {
		
		try {
			
			if (textFile.createNewFile()) {
				System.out.println("File created.");
			} else {
				System.out.println("File already exists.");
			}
		
			writer = new BufferedWriter(new FileWriter(textFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void writeData(String data) {
		
		try {
			writer.write(data);
			writer.newLine();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeWriter() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
