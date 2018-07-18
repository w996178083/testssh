package com.yaodeyu.test.cishu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//test pushing to gitHub  test Two 这是第二次测试!
public class ShuZuCiShu {
  public static void main(String[] args) {
	  int[] b= new  int[50];
	  String c="";
	  for(int i=0; i<50; i++){
		  int a = (int) (Math.random()*10);
		  if(a==0) {
			  b[i] =a+1;
		  }else {
			  b[i]=a;
		  }
		 c+=","+b[i];
	  }
	  String substring = c.substring(1);
	  System.out.println(substring);
	  for(int i =1;i<=10;i++) {
		  String d=i+"";
		  Pattern compile = Pattern.compile(d);
		  Matcher matcher = compile.matcher(c);
		  int found=0;
		  while(matcher.find()) {
			  found++;
		  }
		  System.out.println(i+"在里面的次数是"+found);
	  }
	 
}
  
}