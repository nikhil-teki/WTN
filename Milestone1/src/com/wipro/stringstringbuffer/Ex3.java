package com.wipro.stringstringbuffer;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arglen=args.length;
		String nstr="";
		if(arglen>0)
		{
			String str=args[0];
			int len=str.length();
			if(len<2)
				nstr=str;
			else
			for(int i=0;i<len;i++)
				nstr=nstr+str.substring(0,2);
		}
		System.out.println(nstr);
	}

}
