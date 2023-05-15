package com.phaseOne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileOps {
	String path = "/home/akshay/Documents/file-input/";
	
	public void viewFiles() {
		int j = 1;
		File fp = new File(path);
		System.out.println("<--Files present in the directory in ascending order-->");
		
		System.out.println("-------------------");
		File a[] = fp.listFiles();
		List<String> fileNames = new ArrayList<String>();
		
		for(int i = 0; i <a.length;i++) {
			fileNames.add(a[i].getName());
		}
		Collections.sort(fileNames);
		
		for(String s : fileNames) {
			System.out.println(j+")"+s);
			j++;
		}
		
		System.out.println("-----------------------");
		System.out.println();
	}
	
	public void addNewFile(String fileName, String content) throws IOException{
		File fp = new File(path+fileName);
		
		if(fp.exists()) {
			System.out.println("File already exists!");
		}else if(fp.createNewFile()) {
			System.out.println("File created successfully!");
		} else {
			System.out.println("File not created!");
			return;
		}
		
		FileWriter out = new FileWriter(fp,true);
		out.write(content);
		out.close();
		System.out.println("Content is written to the file successfully!");
		System.out.println("---------------------------");
	}
	
	public void deleteFile(String fileName) {
		File fp = new File(path+fileName);
		
		if(fp.exists()) {
			if(fp.delete()) {
				System.out.println("File deleted successfully!");
			}else {
				System.out.println("File not deleted!");
			}
		}else {
			System.out.println("File does not exist to delete!");
		}
		System.out.println("-------------------------");
	}

	public void searchFile(String fileName) {
		File fp = new File(path+fileName);
		if(fp.exists()) {
			System.out.println(fileName + "Exists at" + fp.getPath());
		}else {
			System.out.println(fileName + "Does not exists!");
		}
		System.out.println("-----------------------------------");
	}
}




