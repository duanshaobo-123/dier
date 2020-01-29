package com.zhangsan.common.utils;

public class NumberUtil {

	
	/*
	* 百分比计算方法，返回值只要整数不需要小数。
	* 给一个当前数，和一个总数，计算当前数百分占比，例如参数为5和10，方法内部
	* 5除以10得0.5，再乘以100，返回50，注意四舍五入。页面就可以显示50%
	*/
	public static int getPercent(int current, int total){
	//TODO 实现代码
		int i = (current*100)/total;
		
		return  i;
	}

	//其它工具方法…
	public static void main(String[] args) {
		int percent = NumberUtil.getPercent(37,101);
		System.out.println(percent+"%");
	}
	
	
}
