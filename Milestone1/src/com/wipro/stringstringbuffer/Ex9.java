package com.wipro.stringstringbuffer;

public class Ex9 {
	public static String mixString(String a, String b)
	{
		int lena=a.length(),lenb=b.length(),len=lena;
		String nstr="";
	    if((lena==0)&&(lenb==0))
		return a;
		if(lena==0)
		return b;
		if(lenb==0)
		return a;
		if(lena>lenb)
		len=lenb;
		for(int i=0;i<len;i++)
		nstr=nstr+a.charAt(i)+b.charAt(i);
		if(lena==lenb)
		return nstr;
		if(lena<lenb)
		return nstr+b.substring(lena);
		return nstr+a.substring(lenb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=args[0].split(",");
		String a="",b="";
		int len=s.length;
		if(len==1)
		a=s[0];
		else if(len==2)
		{
			a=s[0];
			b=s[1];
		}
		System.out.println(mixString(a,b));
	}

}
