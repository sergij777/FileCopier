package org.itstep;

public class FCRunner {

	public static void main(String[] args) {
//		String fromPath = "C:\\cat.jpg";
//		String toPath = "C:\\test\\cat1.jpg";
		FileIO fileIO = new FileIO();
//		fileIO.copyFile(fromPath, toPath);
		
		String fromPath2 = "C:\\test\\example.txt";
		String toPath2 = "C:\\test\\example2.txt";
		fileIO.copyTextFile(fromPath2, toPath2);
		
		
		System.out.println("file copied");
		
		

	}

}
