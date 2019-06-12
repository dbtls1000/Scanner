package com.biz.scan;

public class String_02 {
	public static void main(String[] args) {
		String strNum= "30 ";
		
		//trim()
		//문자열의 앞뒤에있는 whithe space를 제거해주는
		//method
		//white spack = sp,tap(\t),CR
		int intNum = Integer.valueOf(strNum.trim());
		
		// java 11에서는
		// Strip() method를 새롭게 사용할 수 있는데
		// 이 method는 유니코드,UTF-8에 지정되어있는
		// 약 12가지의 white space를 모두 제거할 수 있다.
		
	}
}
