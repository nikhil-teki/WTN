package com.wipro.stringstringbuffer;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=args[0].split(",");
		String a=s[0];
		a=a.toLowerCase();
		String b="";
		if(s.length>1)
		{
			b=s[1];
			b=b.toLowerCase();
		}
		String result="";
		int lena=a.length();
		if((s.length>1)&&(a.length()>0)&&(a.charAt(lena-1)==(b.charAt(0))))
			result=a+b.substring(1);
		else if(a.length()>0)
			result=a+" "+b;
		else
			result=a+b;
		System.out.println(result);
	}

}