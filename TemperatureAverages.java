
//Write a program that reads a file from disk in comma-separated format (CSV). Every line must contain a list of number separated by commas.
//The program must output the average for every line plus the average for the whole file. A file may look like the following:

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TemperatureAverages {

	static int total = 0;
	static int count = 0;

	public static void main(String args[]) {

		String filename = "/Users/stevenjenkins/Desktop/MscComputerScience/PIJ/Exercises/PiJ_Exercises/temp.csv";
		File newFile = new File(filename);

		if (newFile.exists()) {

			try {
				System.out.println("exists");
				BufferedReader in = new BufferedReader(new FileReader(newFile));
				String line;
				while ((line = in.readLine()) != null) {
				total = 0;
				count = 0;
				lineAverage(line);
			

				}
				in.close();
			}	catch (FileNotFoundException ex) {
			System.out.println("does not exist."); 
			} catch (IOException ex) {
			ex.printStackTrace();
			} 

		} else {
			System.out.println("does not exist");
		}

	}

	public static void lineAverage(String l) {
		String[] ar = l.split(",");

		for(int i = 0; i < ar.length; i++) {
			Integer newInt = Integer.parseInt(ar[i]);
			total = total + newInt;
			count = count+1;
		}
		
		System.out.println(total/count);
	}

}












