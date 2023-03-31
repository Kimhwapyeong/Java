package com.objectEx;
//0331
import java.util.HashMap;

public class ObjectEx2 {
	public static void main(String[] args) {
		/**
		 * 		   타입, 타입
		 * HashMap<key, value>
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 1	홍길동
		 * 2	나몰라
		 * 3	나잘난
		 * 
		 */
		
		HashMap<String, String> hashMap = new HashMap<>();
		// 데이터를 담는 방법
		hashMap.put("key", "value");
		hashMap.put("key1", "value1");
		hashMap.put("key", "newValue");
		
		// 데이터를 꺼내는 방법
		String str = hashMap.get("key");
		System.out.println("key : " + str + "\n" + "key1 : " + hashMap.get("key1"));
		System.out.println(hashMap.get("key2"));
		
		HashMap<Integer, String> hashM = new HashMap<>();
		hashM.put(1, "홍길동");
		hashM.put(2, "나몰라");
		hashM.put(3, "나잘난");
		
		System.out.println("***************");
		System.out.println(hashM.get(1));
		System.out.println(hashM.get(2));
		System.out.println(hashM.get(3));
		System.out.println("***************");
	}
}
