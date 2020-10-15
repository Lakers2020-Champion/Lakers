package com.zhiyou;

public class Foreach {
	public static void main(String[] args) {
		fun(1,2,8,10,"zhangsan","ÀîËÄ");
	}
	
	public static void fun(Object ... arg ) {
		for(Object x:arg) {
			System.out.print(x+"¡¢");
		}
	}
	
	public static void fun1(Object ... arg ) {
		for(int m=0;m<arg.length;m++) {
			System.out.print(arg[m]+"¡¢");
		}
	}
}
