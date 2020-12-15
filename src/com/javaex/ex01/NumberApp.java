package com.javaex.ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int num;
		
		System.out.println("******************************************");
		System.out.println("*         전화번호 관리 프로그램         *");
		System.out.println("******************************************");
		
		ArrayList<Number> nList = new ArrayList<Number>();
		NumberVO nv = new NumberVO();
		NumberView nview = new NumberView();
		
		nList.clear();
		nv.readTxt(nList);
		
		while(true) {
			//메뉴 번호 입력
			num = nview.startView();
			//5번을 입력하면 프로그램 종료
			if (num == 5) {
				nview.finishView();
				break;
			}
			//1번을 입력하면 리스트 불러오기
			if (num == 1) {
				System.out.println("<1. 리스트>");
				nview.listView(nList);
				
			} else if (num == 2) {	//2번을 입력시 목록 등록
				System.out.println("<2. 등록>");
				
				nview.inputView(nList);
				nv.writeTxt(nList);

			} else if (num == 3) {	//3번을 입력시 원하는 번호 삭제
				
				nview.deleteView(nList);
				nv.writeTxt(nList);

			} else if(num == 4) {	//4번을 입력하면 해당 단어가 이름에 포함되있는 사람을 검색
				
				System.out.println("<4. 검색>");
				nview.searchView(nList);
				
			} else {
				nview.wrongView();
			}
		}	
	}

}
