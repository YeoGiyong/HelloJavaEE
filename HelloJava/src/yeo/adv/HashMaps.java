package yeo.adv;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import project.v1.SungJukVO;

public class HashMaps {

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {
		// 해시맵 - 데이터 저장은 느리지만, 많은 양의 데이터 검색시 유리
		// 키와 값으로 데이터를 저장 - 키는 중복 x , 값은 중복 허용

		HashMap<Integer, String> hmap1 = new HashMap<>();
		// 키는 숫자형, 값은 문자형인 HashMap 객체 생성
		HashMap<String, SungJukVO> hmap2 = new HashMap<>();
		// 키는 문자형, 값은 SungJukVO인 HashMap 객체 생성

		hmap1.put(11, "혜교");
		hmap1.put(23, "지현");
		hmap1.put(35, "수지");
		hmap1.put(49, "중기");
		// hashmap에 각 요소 추가

		System.out.println("키23 : " + hmap1.get(23));
		System.out.println("키49 : " + hmap1.get(49));
		// 특정키로 검색하기

		System.out.println("키11 : " + hmap1.get(23));
		hmap1.remove(11); // 특정키로 제거
		System.out.println("키11 : " + hmap1.get(23));

		// 모든 내용 출력
		Iterator<Integer> it = hmap1.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "/" + hmap1.get(key));
		}

		SungJukVO sj1 = new SungJukVO("혜교", 98, 78, 56);
		SungJukVO sj2 = new SungJukVO("지현", 54, 85, 63);
		SungJukVO sj3 = new SungJukVO("수지", 32, 52, 47);
		SungJukVO sj4 = new SungJukVO("중기", 87, 23, 14);

		hmap2.put("혜교", sj1);
		hmap2.put("지현", sj2);
		hmap2.put("수지", sj3);
		hmap2.put("중기", sj4);

		System.out.println(hmap2.get("수지"));

		Iterator<String> it2 = hmap2.keySet().iterator();
		while (it2.hasNext()) {
			String key = it2.next();
			System.out.println(key + "/" + hmap2.get(key));

		}

		// 간단한 검색
		Integer key1 = 35;
		String key2 = "지현";

		if (hmap1.containsKey(key1))
			System.out.println(key1 + "/" + hmap1.get(key1));
		else
			System.out.println("데이터가 없어요!!");

		if (hmap2.containsKey(key2))
			System.out.println(key2 + "/" + hmap2.get(key2));
		else
			System.out.println("데이터가 없어요!!");

		Iterator it3 = hmap2.keySet().iterator();
		it3.next();

		Date today = new Date();

		today.getYear();
		today.getMonth();
		today.getDay();
		today.getHours();
		today.getMinutes();
		today.getSeconds();

	}

}
