package com.javaassignments.lab10;

import java.io.*;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		int lineNumber=1;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			Scanner cs = new Scanner(System.in);
			System.out.print("Enter file name : ");
			String fileName = cs.nextLine();
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String line = null;
						
			while(true) {		
				line = br.readLine(); 
                if (line == null) {			
					break;
                }
                if(!(line.isEmpty())) {
                	
                	System.out.println(lineNumber+" "+line);
                	lineNumber++;
                }
			}
			cs.close();
		}
		catch (FileNotFoundException excep) {
			System.out.println("No such file present.");
		} 
		catch(IOException excep) {
			System.out.println("Could not read file.");
		}
		finally 
		{
			try 
			{
				fr.close();
				br.close();
			} 
			catch(IOException excep) {
				excep.printStackTrace();
			}
			
		}
	}


}