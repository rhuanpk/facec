package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

import excecoes.UnreachableException;

public class Arquivo {

	public static File getFileCLI(String prompt) throws UnreachableException {

		// set the scanner
		Scanner scanner = new Scanner(System.in);

		// get the file path
		System.out.print(prompt);
		String filePath = scanner.nextLine();

		// create new File object
		File file = new File(filePath);

		// close the scanner
		scanner.close();

		// if file not exists throws a new exception
		if (!file.exists())
			throw new UnreachableException();

		// return the File object
		return file;

	}

	public static File getFileGUI() throws UnreachableException {

		// set the GUI chooser
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("./"));

		// get the file path
		int result = chooser.showOpenDialog(chooser);
		if (result != JFileChooser.APPROVE_OPTION)
			return null;

		// create new File object
		File file = chooser.getSelectedFile();

		// if file not exists throws a new exception
		if (!file.exists())
			throw new UnreachableException();

		// return the File object
		return file;

	}

	public static void writeTo(String filePath, ArrayList<String> lines) throws IOException {

		// set the file writer
		FileWriter writer = new FileWriter(filePath);

		// iterate over all lines and write it
		for (String line : lines) {
			writer.write(line + "\n");
		}

		// close the file writer
		writer.close();

	}

}
