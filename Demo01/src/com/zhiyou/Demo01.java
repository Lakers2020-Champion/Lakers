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
		// ��Ҫ��-ea��������
		// assert 5<3:"���Խ��Ϊfalse";
		// System.out.println("����֮��Ĵ���");
	}
	public static void method6(int a) throws MyRunTimeException {
		if(a<10) {
			throw new MyRunTimeException("����Ĳ�������С��10");
		}
	}
	public static void method5() {
		try {
			//������ܲ����쳣�Ĵ��롣
			System.out.println(6/0);
		}catch(ArrayIndexOutOfBoundsException e) {
			//û�з����쳣��catch����ִ�С�
			e.printStackTrace();//�����������ʲô�쳣��
			System.out.println("�쳣�������Ϣ");
		}finally {
			System.out.println("�����Ƿ�����쳣����ִ��finally�������");
		}
		System.out.println("finally֮��Ĵ���");
	}
	/*
	 * ʲô�����finally��ִ�С�
	 * 1.��try֮ǰ�Ѿ�return�ˣ�
	 * 2.ʹ��system.exit(0),ǿ�ƹر������
	 * 3.���ɿ�������������ϵ硢�����ȡ�
	 */
	public static void method4() {
		if (3 == 3) {
			return;
		}
		try {
			//������ܲ����쳣�Ĵ��롣
			System.out.println(6/2);
		}catch(ArithmeticException e) {
			//û�з����쳣��catch����ִ�С�
			e.printStackTrace();//�����������ʲô�쳣��
			System.out.println("�쳣�������Ϣ");
		}finally {
			System.out.println("�����Ƿ�����쳣����ִ��finally�������");
		}
	}
	public static void method3() {
		try {
			System.out.println(12/0);
			int [] array = {};
			System.out.println(array[2]);
			String st = null;
			System.out.println(st.equals(null));//��ָ���쳣
			
		} catch(ArithmeticException b) {
			System.out.println("�����쳣");
			b.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("�����±�Խ��");
			a.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception  �����쳣��ͳһ����
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
		System.out.println("�㷨��ʼ");
		try {
			//������ܲ����쳣�Ĵ��롣
			System.out.println(6/2);
		}catch(ArithmeticException e) {
			//û�з����쳣��catch����ִ�С�
			e.printStackTrace();//�����������ʲô�쳣��
			System.out.println("�쳣�������Ϣ");
		}finally {
			System.out.println("�����Ƿ�����쳣����ִ��finally�������");
		}
		
		System.out.println("�㷨����");
	}
}
