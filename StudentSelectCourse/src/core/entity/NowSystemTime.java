package core.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowSystemTime {

	public String getCurrentTime(){
		String ct="";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		ct=df.format(new Date());
		return ct;
	}
}
