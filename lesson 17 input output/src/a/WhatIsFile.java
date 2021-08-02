package a;

import java.io.File;
import java.io.IOException;

public class WhatIsFile {

	public static void main(String[] args) {

		try {
		// File object points to a file or directory in file system.
		
		File directory = new File("c:/eldar");
		File file = new File("c:/eldar/letter.txt");
		
		// Checks if the files exist in the FS.
		System.out.println(directory.exists());
		System.out.println(file.exists());
		
		// Create the files.
		 directory.mkdirs();
		 file.createNewFile();
		
		// Checks if the files exist.
		System.out.println(directory.exists());		
		System.out.println(file.exists());
		
		System.out.println("===================");
		// Checks if file or directory.
		System.out.println(directory);
		System.out.println("Is directory? " + directory.isDirectory());
		System.out.println("Is file? " + directory.isFile());
		
		System.out.println();
		
		System.out.println("Is directory? " + file.isDirectory());
		System.out.println("Is file? " + file.isFile());
		
		System.out.println("===================");
		System.out.println(file.delete());
		System.out.println(directory.delete());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
