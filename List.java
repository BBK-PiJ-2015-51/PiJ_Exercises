//1 ls
//Write a program that shows on screen the names of the files in the current directory. (Hint: look at methods from class File).
//MscComputerScience/PIJ/Exercises/PiJ_Exercises

import java.io.File;


public class List {


public static void main(String args[]) {


String filename = "/Users/stevenjenkins/Desktop/MscComputerScience/PIJ/Exercises/PiJ_Exercises";

File newFile = new File(filename);

String[] paths = newFile.list();


System.out.println("Here are the falls in the directory");

for(String path:paths)
         {
            // prints filename and directory name
            System.out.println(path);
         }



}






}

