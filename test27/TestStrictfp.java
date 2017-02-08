package test27;
/**
 * 
 * @author cleancp
 * 2017年2月8日下午1:52:41
 * strictfp 标准精度计算
 */
public strictfp class TestStrictfp {

	/**
	 //
	 * @param args
	 */
	/*
	 //
	 */
	////
	public static void main(String[] args) {
		
		double d = 4.3143414d;
		float f = 3.13212312412f;
		System.out.println((float)d/f);
		System.out.println(d%f);
		System.out.println(d+f);
		System.out.println(f-d);
	}
}

/**
 * 
1.3774495
1.3774494426260575
1.1822181681121826
7.446464631887817
-1.1822181681121826

1.3774495
1.3774494426260575
1.1822181681121826
7.446464631887817
-1.1822181681121826
 * 
 */
