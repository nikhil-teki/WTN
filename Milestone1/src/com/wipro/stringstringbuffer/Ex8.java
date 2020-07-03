package com.wipro.stringstringbuffer;

public class Ex8 {
	public static String starOut(String str)
	{
		int len=str.length(),nlen=0;
		int[] a=new int[len*3];
		int[] b=new int[len];
		String nstr="";
		for(int i=0;i<len;i++)
		if(str.charAt(i)=='*')
		{
		    a[nlen]=i;
		    nlen++;
		    if(i==0)
		    {
		      a[nlen]=i+1;
		      nlen++;
		    }
		    else if(i==len-1)
		    {
		      a[nlen]=i-1;
		      nlen++;
		    }
		    else
		    {
		      a[nlen]=i-1;
		      nlen++;
		      a[nlen]=i+1;
		      nlen++;
		    }
	    }
		for(int i=0;i<nlen;i++)
		{
		    if((a[i]>=0)&&(a[i]<len))
		    b[a[i]]++;
		}
		for(int i=0;i<len;i++)
		if(b[i]==0)
		nstr=nstr+str.charAt(i);
		return nstr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arglen=args.length;
		String inp="";
		if(arglen>0)
			inp=args[0];
		System.out.println(starOut(inp));
	}
}