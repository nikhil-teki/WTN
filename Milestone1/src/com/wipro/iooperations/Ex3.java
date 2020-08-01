package com.wipro.iooperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String inputFile=args[0];
			String outputFile=args[1];
			FileReader fis=new FileReader(inputFile);
			FileWriter fos=new FileWriter(outputFile);
			Scanner scan=new Scanner(fis);
			Map<String,Integer> tm=new TreeMap<>();
			while(scan.hasNext())
			{
				String s=scan.nextLine();
				String[] sArr=s.split(" ");
				int sArrLen=sArr.length;
				for(int i=0;i<sArrLen;i++)
				{
					String key=sArr[i];
					int count=1;
					if(tm.containsKey(key))
					{
						int value=tm.get(key);
						value++;
						count=value;
						tm.replace(key,count);
					}
					else
						tm.put(key,count);
				}
			}
			scan.close();
			fis.close();
			int i=0;
			int mapSize=tm.size();
			for(Map.Entry<String,Integer> tme:tm.entrySet())
			{
				i++;
				String outputLine=tme.getKey()+" : "+tme.getValue();
				char[] str=outputLine.toCharArray();
				fos.write(str);
				if(i!=mapSize)
				fos.write("\n");
			}
			fos.close();
			//System.out.println("Done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
