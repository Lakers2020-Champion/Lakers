package com.zhiyou100;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		newFile();
	}
	/*
	 * ��ȡĿ¼�����е�Ŀ¼
	 */
	public static void method(File file) {
		if(file.isDirectory()) { //�ж��Ƿ�Ϊ�ļ���
			File[] array = file.listFiles(); //��ȡ���ļ��������е����ļ���
			if(array!=null) { //���ļ��в�Ϊ��
				for(int i = 0;i<array.length;i++) {
					method(array[i]);  //���ļ��н���ѭ�����������Լ�
				}
			}
		}
		System.out.println(file);
	}
	/**
	 * ��ȡ�ļ��Ļ�����Ϣ
	 */
	public static void method(){
		File file = new File("D:\\demo.txt");	
		//File file = new File("F:/1.jpg");	
		// �ļ��Ƿ����
		System.out.println("�ļ��Ƿ����"+file.exists());
		// �Ƿ�ΪĿ¼
		System.out.println("�Ƿ�ΪĿ¼��"+file.isDirectory());
		// �Ƿ�Ϊ�ļ�
		System.out.println("�Ƿ�Ϊ�ļ�"+file.isFile());
		// �ļ��Ĵ�С
		System.out.println("�ļ��Ĵ�СΪ��"+file.length());
		//�ļ������޸�����
		System.out.println("�ļ������޸�����"+new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").
				format(file.lastModified()));
		
	}
	
	/**
	 * ��F����z�ļ�����x�ļ����´���һ��demo.txt
	 * @throws IOException 
	 */
	public static void createMkdirs() throws IOException{
		File file = new File("D:"+File.separator+"a"+File.separator+"b"+File.separator+"demo.txt");		
		if (!file.getParentFile().exists()) {//����ϼ��ļ��в�����
			file.getParentFile().mkdirs();	// �򴴽��ϼ��ļ���
			file.createNewFile();			// �����ļ���
		}		
	}	
	
	/**
	 * ָ��һ���ļ�·��,����ļ����ڵĻ�,ɾ���ļ� ��֮�򴴽��ļ�
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
