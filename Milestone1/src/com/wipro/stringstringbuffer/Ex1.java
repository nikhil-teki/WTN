package com.wipro.stringstringbuffer;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		int len=s.length(),l=len-1;
		boolean palindrome=true;
		for(int i=0;i<len;i++,l--)
		{
			if(s.charAt(i)!=s.charAt(l))
			{
				palindrome=false;
				break;
			}
		}
		System.out.println(palindrome);
	}

}
