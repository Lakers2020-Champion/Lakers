package com.zhiyou100;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		newFile();
	}
	/*
	 * 获取目录下所有的目录
	 */
	public static void method(File file) {
		if(file.isDirectory()) { //判断是否为文件夹
			File[] array = file.listFiles(); //获取该文件夹下所有的子文件夹
			if(array!=null) { //子文件夹不为空
				for(int i = 0;i<array.length;i++) {
					method(array[i]);  //子文件夹进行循环继续调用自己
				}
			}
		}
		System.out.println(file);
	}
	/**
	 * 获取文件的基本信息
	 */
	public static void method(){
		File file = new File("D:\\demo.txt");	
		//File file = new File("F:/1.jpg");	
		// 文件是否存在
		System.out.println("文件是否存在"+file.exists());
		// 是否为目录
		System.out.println("是否为目录："+file.isDirectory());
		// 是否为文件
		System.out.println("是否为文件"+file.isFile());
		// 文件的大小
		System.out.println("文件的大小为："+file.length());
		//文件最后的修改日期
		System.out.println("文件最后的修改日期"+new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").
				format(file.lastModified()));
		
	}
	
	/**
	 * 在F盘下z文件夹下x文件夹下创建一个demo.txt
	 * @throws IOException 
	 */
	public static void createMkdirs() throws IOException{
		File file = new File("D:"+File.separator+"a"+File.separator+"b"+File.separator+"demo.txt");		
		if (!file.getParentFile().exists()) {//如果上级文件夹不存在
			file.getParentFile().mkdirs();	// 则创建上级文件夹
			file.createNewFile();			// 创建文件。
		}		
	}	
	
	/**
	 * 指定一个文件路径,如果文件存在的话,删除文件 反之则创建文件
	 */
	
	public static void newFile() throws IOException {
		File file = new File("D:\\demo.txt");
		if (file.exists()) {
			file.delete();
		}else {
			file.createNewFile();
		}
	}
}
