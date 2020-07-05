package com.wipro.iooperations;

import java.io.FileReader;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName=scan.nextLine();
		System.out.println("Enter the character to be counted");
		char key=scan.next().charAt(0);
		String path="G:\\WTN-workspace\\WTN\\Milestone1\\src\\com\\wipro\\iooperations\\";
		try
		{
			FileReader fin=new FileReader(path+fileName);
			int ch,count=0;
			while((ch=fin.read())!=-1)
				if(((char)ch)==key)
					count++;
			fin.close();
			System.out.println("File '"+fileName+"' has "+count+" instances of letter '"+key+"'");
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
