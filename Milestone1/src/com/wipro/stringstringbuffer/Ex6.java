package com.wipro.stringstringbuffer;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arglen=args.length;
		String nstr="";
		if(arglen==1)
			nstr=args[0];
		else if(arglen>1)
		{
			String a=args[0];
			String b=args[1];
			int lena=a.length(),lenb=b.length();
			nstr=(lena>lenb)?b+a+b:a+b+a;
		}
		System.out.println(nstr);
	}

}
