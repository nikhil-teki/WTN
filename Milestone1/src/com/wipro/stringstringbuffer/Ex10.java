package com.wipro.stringstringbuffer;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=args[0].split(",");
		String nstr="";
		if(!s[0].equals(""))
		{
			String str=s[0];
			int len=str.length();
			int c=Integer.parseInt(s[1]);
			for(int i=1;i<=c;i++)
				nstr=nstr+str.substring(len-c);
		}
		System.out.println(nstr);
	}

}
