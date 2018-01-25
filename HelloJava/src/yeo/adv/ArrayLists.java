package yeo.adv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.v1.SungJukVO;

public class ArrayLists {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		// 배열
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;

		// 컬렉션 프레임워크
		// 동일한 자료형의 여러 객체의 묶음을 손쉽게 다루게 해줌
		// List : 순차구조, 순서있는 객체 다룸, 중복허용

		List list = new ArrayList();
		list.add("혜교");
		list.add(94);
		list.add(123.456);
		list.add(true);
		list.add(new SungJukVO());

		for (int i = 0; i < 5; ++i)
			System.out.println(list.get(i));

		// ArrayList에 저장된 내용들은 Object형
		// 따라서, 그것을 get해서 각각의 변수에 저장하려 할 때
		// 불필요한 형변환이 발생 - 성능저하 요인

		String name = (String) list.get(0);
		int vall = (int) list.get(1);
		double nTmp2 = (double) list.get(2);
		boolean nTmp3 = (boolean) list.get(3);
		SungJukVO sj = (SungJukVO) list.get(4);

		// 지네릭스 Generic
		// 컬렉션 프레임워크를 사용할 때
		// 타입을 지정하지 않고 객체를 저장하면
		// 그것을 출력시 불필요한 형변환 발생하는데
		// JDK5에서는 이것을 막고자 지네릭을 도입
		// 컬렉션을 선언할 때 어떤 종류의 객체를 저장할지
		// 미리 결정해야하는데 그것을 <> 기호로 정의
		List cage1 = new ArrayList();
		cage1.add(new Tiger());
		cage1.add(new Zibra());
		cage1.add(new Lion());

		Tiger t = (Tiger) cage1.get(0);
		// Zibra z = (Tiger)cage1.get(1);
		// Lion l = (Tiger)cage1.get(2);

		List<Tiger> cage2 = new ArrayList<Tiger>();
		List<Zibra> cage3 = new ArrayList<>();
		List<Lion> cage4 = new ArrayList<>();

		cage2.add(new Tiger());
		t = cage2.get(0);
		// cage2.add(new Zibra());

		// ArrayList의 CRUD
		List<String> names = new ArrayList<>();

		// 추가 : add
		names.add("혜교");
		names.add("수지");
		names.add("지현");

		// 조회 : get
		// System.out.println(names.get(0));
		// System.out.println(names.get(1));
		// System.out.println(names.get(2));
		for (int i = 0; i < names.size(); ++i)
			System.out.println(names.get(i));

		for (String val : names)
			System.out.println(val);

		// 검색 : indexOf(값)
		int pos = names.indexOf("수지");
		System.out.println("수지의 위치" + pos);

		// 순환자를 이용해서 컬렉션의 모든 요소 출력
		// 컬렉션클래스로 선언된 요소들을
		// 하나씩 읽어오기 위한 표준화된 방식을 제공 - 속도 느림
		// hasNext : 컬렉션에 요소가 존재하는지 여부 검사
		// next : 요소를 읽어 올수 있는지 여부 검사
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}

		// 갯수 : size
		System.out.println(names.size());

		// 삭제 : remove
		names.remove(2);
		System.out.println(names.size());

		// 수정 : set(위치, 값)
		System.out.println(names.get(0));
		names.set(0, "중기");
		System.out.println(names.get(0));

		// 모두 제거 : clear
		names.clear();
		System.out.println(names.size());
	}

}

class Tiger {
}

class Zibra {
}

class Lion {
}
