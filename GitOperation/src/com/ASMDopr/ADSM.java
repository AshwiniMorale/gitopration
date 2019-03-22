package com.ASMDopr;

public class ADSM {

	int a=10;
	int b=20;
	public void add()
	{
		System.out.println("addition "+(a+b));
	}
	
	public void sub()
	{
		System.out.println("substraction "+(a-b));
	}

	public void dev() {
		System.out.println("substraction "+(a/b));
	}
	
	public static void main(String[] args)
	{
		ADSM ob = new ADSM();
		ob.add();
		ob.sub();
	}

}
