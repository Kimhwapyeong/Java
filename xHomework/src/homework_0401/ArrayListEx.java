package homework_0401;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// 리스트에 저장
		list.add("Kimhwapyeong");
		list.add("Kimdaejoong");
		list.add("Kimhaneul");
		list.add("Junghaeja");
		list.add("Kimgu");
		
		// 리스트 변경
		list.set(3, "Jungddungi");
		
		// 리스트 총 저장 갯수
		int size = list.size();
		System.out.println(size);
		
		// 인덱스에 추가하고, 뒤로 밀림
		list.add(0, "Kimsungsu");
		size = list.size();
		System.out.println(size);
		
		// 리스트에 저장된 객체 얻기
		String get = list.get(3);
		System.out.println(get);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "번 인덱스에 저장된 객체 : " + list.get(i));
		}
		int i = 0;
		for(String a : list) {
			System.out.println(list.get(i));
			i++;
		}
		
		
		
	}
}
