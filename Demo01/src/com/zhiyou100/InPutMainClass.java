package com.zhiyou100;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InPutMainClass {
public static void main(String[] args) throws Exception {
	//����һ���ļ�ʵ������
	File file = new File("D:\\Users\\eclipse-workspace\\Demo01\\src\\com\\zhiyou100\\readme");
	//ͨ���ļ�ʵ�����󴴽�һ���ֽ�����������
	InputStream in = new FileInputStream(file);
	//����һ��byte�������ڴ洢����
	byte[] b = new byte[(int)file.length()];
	//���������е�����д��byte������
	in.read(b);
	//��byte����ת�����ַ���
	System.out.println(new String(b));
	//��Ҫ���ǹر���
	in.close();
//	
//	System.out.println("----------------");
//	int time = 0; //����һ������������ֵ�Ķ���
//	int number = 0;
//	while((time=in.read())!=-1) {
//		b[number++] = (byte) time;
//	}
//	System.out.println(new String(b));
//	in.close();
}
}
