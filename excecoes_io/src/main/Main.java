package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import excecoes.UnreachableException;

public class Main {

	public static void main(String[] args) {

		// set the number formatter
		DecimalFormat df = new DecimalFormat("#.##");

		// main try-catch
		try {

			// count iterator
			int count = 0;

			// set the file reader
			// File file = Arquivo.getFileGUI();
			File file = Arquivo.getFileCLI("file path: ");
			Scanner reader = new Scanner(file);

			// print the file content
			System.out.println("\nfile content");
			while (reader.hasNextLine())
				System.out.printf("linha %d = %s\n", ++count, reader.nextLine());

			// set the fileSize
			double contentSize = file.length() / Math.pow(1024, 2);

			// set the file info
			ArrayList<String> fileInfo = new ArrayList<>();
			fileInfo.add("file infos");
			fileInfo.add("name: " + file.getName());
			fileInfo.add("path: " + file.getAbsolutePath());
			fileInfo.add("readable: " + file.canRead());
			fileInfo.add("writeable: " + file.canWrite());
			fileInfo.add("size: " + df.format(contentSize) + " MiB");

			// iterate over all file info and print it
			System.out.println();
			fileInfo.forEach(info -> System.out.println(info));

			// create the report file
			String pathReport = file.getParent() + "/report.txt"; // set the path of report file
			File report = new File(pathReport);
			if (report.createNewFile()) {
				System.out.println("\nreport file created");
			} else {
				System.out.println("\nreport file will be overwrite");
			}

			// write the report file
			Arquivo.writeTo(pathReport, fileInfo);
			System.out.println("report generated");

			// close objects
			reader.close();

		} catch (UnreachableException e) {

			// print error message
			System.err.println("error in open file: " + e.getMessage());

		} catch (FileNotFoundException e) {

			// print error message
			System.err.println("error in open file: " + e.getMessage());

		} catch (IOException e) {

			// print error message
			System.err.println("error in create or write file: " + e.getMessage());

		}

	}

}
