package com.zhiyou100;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutMainClass {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream(new File("D:\\demo.txt"),true);
		//\r\n ����
		String string = "�������������˴���\r\n";
		//�Ƚ�����ת�����ֽ�����
		byte[] bytes = string.getBytes();
		//���ֽ�����д�뵽�ļ���
		out.write(bytes);
		out.close();
	}
}
