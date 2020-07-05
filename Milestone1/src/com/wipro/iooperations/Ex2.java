package com.wipro.iooperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFile=scan.nextLine();
		System.out.println("Enter the output file name");
		String outputFile=scan.nextLine();
		String path="G:\\WTN-workspace\\WTN\\Milestone1\\src\\com\\wipro\\iooperations\\";
		try
		{
			FileReader fin=new FileReader(path+inputFile);
			FileWriter fout=new FileWriter(path+outputFile);
			int ch;
			while((ch=fin.read())!=-1)
				fout.write(ch);
			System.out.println("File is copied");
			fin.close();
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			scan.close();
		}
	}

}
