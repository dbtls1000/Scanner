package com.biz.scan;

public class StringInt_01 {
	public static void main(String[] args) {
			
		System.out.println(30+40);//70
		System.out.println("30+40");//30+40
		
		// "30"과"40"은 문자열형 숫자라고 하며
		// 숫자 30고 숫자 40으로 변환시켜
		// 4칙연산을 수행할 수도 있다.
		System.out.println("30" + "40");//3040
		
		// 문자열을 정수로 변환하여 덧셈
		System.out.println(Integer.valueOf("30")+Integer.valueOf("40"));//70
		
		// 정수를 문자열로 변환하여 연결
		System.out.println(Integer.toString(30) + Integer.toString(40));//3040
		
		System.out.println(Float.valueOf("30.0f"));
		
		// 30문자열 뒤에 white space 가 있어서
		// 숫자로 변환할수 없다
		// numberFormat exception
		System.out.println(Integer.valueOf("30 "));
		
	}
}
