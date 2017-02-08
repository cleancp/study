package test28;
/**
 * 
 * @author cleancp
 * 2017年2月8日下午1:51:46
 * 运算符操作
 */
public class OperationMark {

	public static void main(String[] args) {
		
		System.out.println(-7>>2);
		System.out.println(4>>1);
		System.out.println(4<<1);
		System.out.println(-5<<1);
		System.out.println(5>>2<<2);	
		int a = 2;
		int b = 3;
		a = a^b;
		b = a^b;
		a = a^b;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		a = a*b;
		b = a/b;
		a = a/b;

		System.out.println("a="+a+"---b="+b);
		//60的十六进制显示
		int num = 60 ;
		//后四位
		String[] arr =new String[8];
		Integer eFour = num&15;
		arr[1] = (eFour>9?((Character.toString((char)(eFour-10+'A')))):eFour.toString());
		Integer etFour = (num>>4)&15;
		arr[0] = (etFour>9?((Character.toString((char)(eFour-10+'A')))):etFour.toString());
		
		StringBuffer sb = new StringBuffer("0X");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				sb.append(arr[i]);
			} 
		}
		System.out.println(sb.toString());
	}
}
