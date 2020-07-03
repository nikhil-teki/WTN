package com.wipro.stringstringbuffer;

public class Ex7 {
	public static String withoutX(String str)
	{
		int len=str.length();
		if((len==0)||(str.equals("x")))
		return "";
		if(str.equals("xx"))
		return "";
		if((str.charAt(0)=='x')&&(str.charAt(len-1)=='x'))
		return str.substring(1,len-1);
		if(str.charAt(0)=='x')
		return str.substring(1);
		if(str.charAt(len-1)=='x')
		return str.substring(0,len-1);
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arglen=args.length;
		String inp="";
		if(arglen>0)
			inp=args[0];
		System.out.println(withoutX(inp));
	}

}
