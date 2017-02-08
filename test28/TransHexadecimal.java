package test28;

import java.util.Scanner;
/**
 * 
 * @author cleancp
 * 2017年2月8日下午1:51:32
 * 十进制转16进制
 */
public class TransHexadecimal {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数值:");
		Long num = (long) (Math.floor(s.nextLong()));
		String [] arr = int2Sixteen(num,fourTimes(num));
		StringBuffer sb = new StringBuffer("0X");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(num +" 的十六进制转换结果:"+sb.toString());
	}
	/**
	 * 整形转16进制
	 * @param num
	 */
	public static String[] int2Sixteen(Long num , int times){
		String [] arr = new String[times]; 
		Long four = 0l;
		for (int i = arr.length-1; i >= 0; i--) {
			if(i == arr.length-1){
				four = num&15;
			}else{
				num = num>>4;
				four = num&15;
			}
			arr[i] = (four>9?(Character.toString((char)(four-10+'A'))):four.toString());
		}
		return arr;
	}
	/**
	 * 
	 * @param y //整数值
	 * @return 几个 4位 
	 */
	public static int fourTimes(Long y){
		int i=0;
		while(y>0){
			i++;
			y=y>>4;
		}
		return i;
	} 
}

