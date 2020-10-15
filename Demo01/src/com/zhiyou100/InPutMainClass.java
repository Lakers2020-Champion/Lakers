package com.zhiyou100;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InPutMainClass {
public static void main(String[] args) throws Exception {
	//创建一个文件实例对象
	File file = new File("D:\\Users\\eclipse-workspace\\Demo01\\src\\com\\zhiyou100\\readme");
	//通过文件实例对象创建一个字节输入流对象
	InputStream in = new FileInputStream(file);
	//创建一个byte数组用于存储数据
	byte[] b = new byte[(int)file.length()];
	//将输入流中的内容写到byte数组中
	in.read(b);
	//将byte数组转化成字符串
	System.out.println(new String(b));
	//不要忘记关闭流
	in.close();
//	
//	System.out.println("----------------");
//	int time = 0; //定义一个接受输入流值的对象；
//	int number = 0;
//	while((time=in.read())!=-1) {
//		b[number++] = (byte) time;
//	}
//	System.out.println(new String(b));
//	in.close();
}
}
