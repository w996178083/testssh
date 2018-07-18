package com.yaodeyu.testshuzu;

public class TestMax {
	public static void main(String[] args) {
		 int[] a=new int[20];
		 int max=12;
		 int min = 0;
		 for(int i=0;i<a.length;i++) {
			 a[i]=(int) ((Math.random())*10);
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
			
		 }
		 System.out.println(max+">>>>"+min);
		 System.out.println(max-min);
		 
	}
}
