package com.javaex.ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberView {
	Scanner sc = new Scanner(System.in);
	
	public int startView() {
		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
		System.out.println("-----------------------------------------");
		System.out.print(">> 메뉴번호 : ");
		
		return sc.nextInt();
	}
	
	public void finishView() {
		System.out.println("******************************************");
		System.out.println("*               감사합니다               *");
		System.out.println("******************************************");
	}
	
	public void listView(ArrayList<Number> nList) {
		for (int i = 0; i < nList.size(); i++) {
			System.out.println((i+1) + ".\t" + nList.get(i).getName() +
								"\t" + nList.get(i).getHp() + "\t" + nList.get(i).getCompany());	
		}
		System.out.println("");
	}
	
	public void inputView(ArrayList<Number> nList) {
		System.out.print("> 이름 : ");
		String name = sc.next();
		System.out.print("> 휴대전화 : ");
		String hp = sc.next();
		System.out.print("> 회사전화 : ");
		String company = sc.next();
		
		Number n02 = new Number(name, hp, company);
		nList.add(n02);

		System.out.println("[등록되었습니다.]");
		System.out.println("");
	}
	
	public void deleteView(ArrayList<Number> nList) {
		System.out.print(">> 번호 : ");
		int number = sc.nextInt();
						
		for(int i=0; i < nList.size(); i++) {
			if((number-1) == i) {
				nList.remove(i);
			}
		}
		System.out.println("삭제되었습니다.");
		System.out.println("");
	}
	
	public void searchView(ArrayList<Number> nList) {
		System.out.print(">> 이름 : ");
		String str = sc.next();
		
		for(int i = 0; i < nList.size(); i++) {
			//indexof 함수로 해당 문자열이 있는지 찾아본다. (-1이 나오면 없는것)
			if((nList.get(i).getName().indexOf(str)) != -1) {
				System.out.println((i+1) + ".\t" + nList.get(i).getName() +
						"\t" + nList.get(i).getHp() + "\t" + nList.get(i).getCompany());
			}
		}
	}
	
	public void wrongView() {
		System.out.println("[다시 입력해 주세요.]");
		System.out.println("");
	}

}
