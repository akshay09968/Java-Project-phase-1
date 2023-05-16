package com.phaseOne;

import java.io.IOException;
import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args) throws IOException {
		Scanner in =new Scanner(System.in);
		FileOps fop = new FileOps();
		System.out.println("Project name: LockedMe.com\t Developer Name:Akshay Deshpande");
		
		
		while(true) {
			
			System.out.println("1. Retriving all the file names in an ascending order\n2.Business level operations\n3.Exit from the application");
			
			System.out.println("Enter your choice: ");
			int choice = in.nextInt();
			
			switch(choice) {
			case 1 :{
				fop.viewFiles();
				break;
			    }
			case 2 :{
				
				System.out.println("\t1. Add a file to the application\n\t2.Delete a file from the application\n\t3.Search file from the application\n\t4.Exit\n");
				
				int choice2 = in.nextInt();
				
				switch(choice2) {
				case 1:{
					System.out.println("Enter the file name : ");
					String fileName = in.next();
					in.nextLine();
					System.out.println("Enter the content of the file: ");
					String content = in.nextLine();
					fop.addNewFile(fileName, content);
					break;
				}
					case 2:{
						System.out.println("Enter the file name to delete: ");
						String fname = in.next();
						fop.deleteFile(fname);
						break;
					}
					case 3:{
						System.out.println("Enter file name to search: ");
						String fname = in.next();
						fop.searchFile(fname);
						break;
					}
					case 4: break;
					default : System.out.println("Invalid choice!!");
				
				}
			}
				case 3: {
					System.out.println("\n\n Thanks for using our app!!");
					System.exit(0);
				}
				default:System.out.println("Enter correct choice");
						break;
				
			}
		}
	}
}