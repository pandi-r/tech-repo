package com.tech;

import com.tech.inter.FuncInterface;

public class CommonController{
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Changing message!");
		
		FuncInterface funcInter = () -> {
			System.out.println("Functional Interface");
		};
		
		funcInter.disp();
		
	}
}
