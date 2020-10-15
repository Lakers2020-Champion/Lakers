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
		//获取文件实例化对象
		File file = new File("D:\\Users\\eclipse-workspace\\Demo01\\src\\com\\zhiyou100\\readme");
		//创建字符输入流对象
		Reader reader = new FileReader(file);
		//根据文件的实例对象获得文件长度
		char[] c = new char[(int) file.length()];
		//将文件中的内容存储到cha数组中
		reader.read(c);
		//将char数组转换成字符串输出
		System.out.println(new String(c));
		reader.close();
	}
	
	public static void output() throws Exception {
		//字符输入流（封装了字节输入流）
				// Writer out = new OutputStreamWriter(new FileOutputStream(new File("D:\\demo.txt")));
				Writer out = new FileWriter(new File("D:\\demo.txt"),true);
				out.write("可能走不了了\r\n");
				out.flush();
				out.close();
	}
}
