package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_06 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고 키보드로부터 1부터 10까지 숫자를 입력받아서 난수를 맞추는 게임 작성
		 * 
		 * 단,임의로 종료를 선택할때까지 계속해서 새로운 난수를 만들고 게임을 계속할 수 있도록 하시오.
		 */
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int use = 0;
		int intRnd = rnd.nextInt(10) + 1;
		while (true) {
			System.out.print("숫자 1~10 입력 . 종료(--END) >>");
			
			String strKey = scan.nextLine();
			if (strKey.equals("--END")) {
				System.out.println("게임을 종료합니다");
				break;
			}
			// 1번코드
			// 1. 보통은 중요한 코드 (정답검사)를 위쪽에 두는 것이 좋지만
			//    다음처럼 코드를 작성해도 큰 문제는 없다
			// 2. 다만, 이 코드는 정답을 맞추었더라도
			//    정답이 아닌경우를 먼저 검사 한 후
			//    정답을 다시 검사하는 코드 중복실행이 발생한다.
			int intKey = Integer.valueOf(strKey.trim());
			use++;
			if (intKey > intRnd) {
				System.out.println("큰 수를 입력했군요");
			}
			if (intKey < intRnd) {
				System.out.println("작은 수를 입력했군요");
			}
			if (intKey == intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(use + "번만에 성공");
				intRnd = rnd.nextInt(10)+1;
				use = 0;
				System.out.println("-----NewGame-----");
			}
			
		}

	}

}
