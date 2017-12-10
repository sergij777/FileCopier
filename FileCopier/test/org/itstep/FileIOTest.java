package org.itstep;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileIOTest {

	@Test
	public void testCopyFile() {
		String fromPath = "C:\\cat.jpg";
		String toPath = "C:\\test\\cat2.jpg";
		
		FileIO fileIO = new FileIO();
		fileIO.copyFile(fromPath, toPath);
		
		byte[] bytes = fileIO.readDataFromFile(toPath);
		assertTrue(bytes.length > 0);
		
		File file = new File(toPath);
		file.delete();
	}

	@Test
	public void testCopyTextFile() {
		String fromPath = "C:\\test\\example.txt";
		String toPath = "C:\\test\\example2.txt";
		
		FileIO fileT = new FileIO();
		fileT.copyTextFile(fromPath, toPath);
		
		String oldFile = fileT.readTextFromFile(fromPath);
		String newFile = fileT.readTextFromFile(toPath);
		assertEquals(newFile, oldFile);
		
		File file = new File(toPath);
		file.delete();
		
	}

}
