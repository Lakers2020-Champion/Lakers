package com.zhiyou100;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import javax.swing.Spring;

public class WriteAndReadMainClass {
	public static void main(String[] args) throws Exception {
		output();
	}
	
	public static void inPut() throws Exception {
		//��ȡ�ļ�ʵ��������
		File file = new File("D:\\Users\\eclipse-workspace\\Demo01\\src\\com\\zhiyou100\\readme");
		//�����ַ�����������
		Reader reader = new FileReader(file);
		//�����ļ���ʵ���������ļ�����
		char[] c = new char[(int) file.length()];
		//���ļ��е����ݴ洢��cha������
		reader.read(c);
		//��char����ת�����ַ������
		System.out.println(new String(c));
		reader.close();
	}
	
	public static void output() throws Exception {
		//�ַ�����������װ���ֽ���������
				// Writer out = new OutputStreamWriter(new FileOutputStream(new File("D:\\demo.txt")));
				Writer out = new FileWriter(new File("D:\\demo.txt"),true);
				out.write("�����߲�����\r\n");
				out.flush();
				out.close();
	}
}
