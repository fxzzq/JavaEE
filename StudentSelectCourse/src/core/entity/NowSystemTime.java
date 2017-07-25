package core.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowSystemTime {

	public String getCurrentTime(){
		String ct="";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		ct=df.format(new Date());
		return ct;
	}
}
