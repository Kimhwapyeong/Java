package com.kh.object;
//0324
import com.kh.object.practice.Product2;

public class Application2 {
	public static void main(String[] args) {
		Product2 product1 = new Product2("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product2 product2 = new Product2("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product2 product3 = new Product2("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		System.out.println("=========================================");
		
		product1.setPrice(1200000);
		product2.setPrice(1200000);
		product3.setPrice(1200000);
		product1.setTax(0.05);
		product2.setTax(0.05);
		product3.setTax(0.05);
		
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		System.out.println("=========================================");
		
		product1.culc();
		product2.culc();
		product3.culc();
	}
	
}
