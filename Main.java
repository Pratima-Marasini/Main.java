package Problem5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		String root = System.getProperty("user.dir");
		String fileName1 = "textfile1.txt";
		String filePath1 = root + "\\src\\Problem5\\" + fileName1;
		String fileName2 = "textfile2.txt";
		String filePath2 = root + "\\src\\Problem5\\" + fileName2;

		BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
		BufferedReader reader2 = new BufferedReader(new FileReader(filePath2));
		String line1 = reader1.readLine();
		String line2 = reader2.readLine();

		boolean areEqual = true;
		int lineNumber = 1;

		while (line1 != null || line2 != null) {
			if (line1 == null || line2 == null || !line1.equalsIgnoreCase(line2)) {
				areEqual = false;
				System.out.println("Different at line: " + lineNumber);
				System.out.println("	File 1: " + line1);
				System.out.println("	File 2: " + line2);
			} 
			line1 = reader1.readLine();
			line2 = reader2.readLine();
			lineNumber++;
		}

		if (areEqual) {
			System.out.println("File 1 and file 2 are the same");
		} else {
			
		}

		reader1.close();
		reader2.close();
	}
}