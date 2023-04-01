package homework_0401;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("김두환");
		list.add("김좌진");
		list.add("김또깡");
		list.add("홍길똥");
		
		int size = list.size();
		System.out.println(size);
		
		list.add(0, "김대포");
		
		size = list.size();
		System.out.println(size);
		
		String get = list.get(0);
		System.out.println(get);
		
		System.out.println("*************");
		
		list.set(4, "유관순");
		System.out.println(list.get(4));
		
		int i = 0;
		for(String a : list) {
			System.out.println(list.get(i));  // a. 은 왜 안 될까?
			i++;
		}
		
	}
}
