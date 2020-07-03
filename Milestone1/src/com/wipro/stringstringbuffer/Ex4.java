package com.wipro.stringstringbuffer;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arglen=args.length;
		String nstr="";
		if(arglen>0)
		{
			String str=args[0];
			int len=str.length();
			if((len&1)==0)
				nstr=str.substring(0,len/2);
			else
				nstr="null";
		}
		System.out.println(nstr);
	}

}
