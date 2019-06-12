package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; // 초기화코드(=new Random();)을 생성자로...
	private Scanner scan;

	// 생성자 method
	public NumPick_03() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);

	}

	public void pickup() {

		int use = 0;
		int intRnd = rnd.nextInt(10) + 1;
		while (true) {
			System.out.print("숫자 1~10 입력 . 종료(--END) >>");

			String strKey = scan.nextLine();
			if (strKey.equals("--END")) {
				System.out.println("게임을 종료합니다");
				break;
			}
			int intKey = Integer.valueOf(strKey.trim());
			use++;
			if (intKey == intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(use + "번만에 성공");
				intRnd = rnd.nextInt(10) + 1;
				use = 0;
				System.out.println("-----NewGame-----");
			} else {
				if (intKey > intRnd) {
					System.out.println("큰 수를 입력했군요");
				}
				if (intKey < intRnd) {
					System.out.println("작은 수를 입력했군요");
				}

			}

		}

	}

}
