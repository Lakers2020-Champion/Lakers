package com.zhiyou100;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutMainClass {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream(new File("D:\\demo.txt"),true);
		//\r\n 换行
		String string = "今天外面下起了大雨\r\n";
		//先将内容转换成字节数组
		byte[] bytes = string.getBytes();
		//将字节数组写入到文件中
		out.write(bytes);
		out.close();
	}
}
