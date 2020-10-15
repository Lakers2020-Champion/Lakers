package com.zhiyou;

public class Demo01 {
	public static void main(String[] args) {
		try {
			method6(2);
		} catch (MyRunTimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		// 需要用-ea开启断言
		// assert 5<3:"断言结果为false";
		// System.out.println("断言之后的代码");
	}
	public static void method6(int a) throws MyRunTimeException {
		if(a<10) {
			throw new MyRunTimeException("传入的参数不能小于10");
		}
	}
	public static void method5() {
		try {
			//放入可能产生异常的代码。
			System.out.println(6/0);
		}catch(ArrayIndexOutOfBoundsException e) {
			//没有发生异常，catch不会执行。
			e.printStackTrace();//输出产生的是什么异常。
			System.out.println("异常处理的信息");
		}finally {
			System.out.println("无论是否产生异常都会执行finally里的内容");
		}
		System.out.println("finally之后的代码");
	}
	/*
	 * 什么情况下finally不执行。
	 * 1.在try之前已经return了，
	 * 2.使用system.exit(0),强制关闭虚拟机
	 * 3.不可抗拒物理情况，断电、死机等。
	 */
	public static void method4() {
		if (3 == 3) {
			return;
		}
		try {
			//放入可能产生异常的代码。
			System.out.println(6/2);
		}catch(ArithmeticException e) {
			//没有发生异常，catch不会执行。
			e.printStackTrace();//输出产生的是什么异常。
			System.out.println("异常处理的信息");
		}finally {
			System.out.println("无论是否产生异常都会执行finally里的内容");
		}
	}
	public static void method3() {
		try {
			System.out.println(12/0);
			int [] array = {};
			System.out.println(array[2]);
			String st = null;
			System.out.println(st.equals(null));//空指针异常
			
		} catch(ArithmeticException b) {
			System.out.println("算数异常");
			b.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("数组下标越界");
			a.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception  其他异常的统一处理。
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
	}
	public static int method2() {
		int a = 1;
		try {
			System.out.println("try");
			return ++a;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch");
		}finally {
			System.out.println("finally");
			System.out.println("a="+a);
		}
		return 20;
	}
	public static void method1() {
		System.out.println("算法开始");
		try {
			//放入可能产生异常的代码。
			System.out.println(6/2);
		}catch(ArithmeticException e) {
			//没有发生异常，catch不会执行。
			e.printStackTrace();//输出产生的是什么异常。
			System.out.println("异常处理的信息");
		}finally {
			System.out.println("无论是否产生异常都会执行finally里的内容");
		}
		
		System.out.println("算法结束");
	}
}
