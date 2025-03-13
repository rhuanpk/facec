package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // set the general scanner
		DecimalFormat df = new DecimalFormat("#.##"); // set the number formatter

		// main try-catch
		try {

			int count = 0; // count iterator

			// get the file path from user
			System.out.print("file path: ");
			String pathFile = scanner.nextLine();

			// set the file reader
			// Scanner reader = new Scanner(new FileReader(pathName));
			File file = new File(pathFile);
			Scanner reader = new Scanner(file);

			// print the file content
			System.out.println("\nfile content");
			while (reader.hasNextLine())
				System.out.printf("linha %d = %s\n", ++count, reader.nextLine());

			// check if file exists
			if (file.exists()) {
				String pathReport = file.getParent() + "/report.txt"; // set the path of report file
				double contentSize = file.length() / Math.pow(1024, 2); // set the fileSize

				// set the file info
				String headerMessage = "file infos";
				String fileName = "name: " + file.getName();
				String filePath = "path: " + file.getAbsolutePath();
				String fileReadable = "readable: " + file.canRead();
				String fileWriteable = "writeable: " + file.canWrite();
				String fileSize = "size: " + df.format(contentSize) + " MiB";

				// print the file info
				System.out.println("\n" + headerMessage);
				System.out.println(fileName);
				System.out.println(filePath);
				System.out.println(fileReadable);
				System.out.println(fileWriteable);
				System.out.println(fileSize);

				// create the report file
				File report = new File(pathReport);
				if (report.createNewFile()) {
					System.out.println("\nreport file created");
				} else {
					System.out.println("\nreport file will be overwrite");
				}

				// write the report file
				FileWriter writer = new FileWriter(pathReport);
				writer.write(headerMessage + "\n");
				writer.write(fileName + "\n");
				writer.write(filePath + "\n");
				writer.write(fileReadable + "\n");
				writer.write(fileWriteable + "\n");
				writer.write(fileSize + "\n");

				// print success message
				System.out.println("report generated");

				// close objects
				writer.close();

			}

			// close objects
			reader.close();

		} catch (FileNotFoundException e) {

			// print error message
			System.err.println("error in open content file: " + e.getMessage());

		} catch (IOException e) {

			// print error message
			System.err.println("error in create or write to report file: " + e.getMessage());

		} finally {

			// close objects
			scanner.close();

		}

	}

}
