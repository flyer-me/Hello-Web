package com.tnt.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 文件上传的工具类
 */
public class FileUploadUtil {
	
	/*
	 * 获取系统当前时间的字符串
	 */
	public static String getDataPath(){
		Date date = new Date();//获取系统当前时间
		SimpleDateFormat pathFormat = new SimpleDateFormat("yyyyMMdd");
		String datePath = pathFormat.format(date);//日期
		return datePath;
	}
	
	/*
	 * 给文件重命名
	 */
	public static String getRefileName(String fileName){
		Date date = new Date();//获取系统当前时间
		//日期格式化对象
		SimpleDateFormat nameFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String fn1 = nameFormat.format(date);//系统时间
		int rd =(int)(Math.random()*100000);//随机数
		String newFileName = fn1 + rd + "_" + fileName;
		return newFileName;
	}
	
}
