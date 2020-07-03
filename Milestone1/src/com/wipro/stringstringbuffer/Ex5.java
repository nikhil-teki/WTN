package com.wipro.stringstringbuffer;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arglen=args.length;
		String nstr="";
		if(arglen>0)
		{
			String str=args[0];
			int len=str.length();
			if(len>2)
				nstr=str.substring(1,len-1);
		}
		System.out.println(nstr);
	}

}
