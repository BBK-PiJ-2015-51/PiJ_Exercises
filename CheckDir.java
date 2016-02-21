
//Write a program that takes a name from the user at the command line. 
//If a file with that name exists, the program must show its contents on screen. If //it does not, the program must say so.

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CheckDir {

	public static void main(String args[]) {

		String name = args[0];

		String filename = "/Users/stevenjenkins/Desktop/MscComputerScience/PIJ/Exercises/PiJ_Exercises/" + name;
		File newFile = new File(filename);

		if (newFile.exists()) {

			try {
				System.out.println("exists");
				BufferedReader in = new BufferedReader(new FileReader(newFile));
				String line;
				while ((line = in.readLine()) != null) {
				System.out.println(line);	
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
}