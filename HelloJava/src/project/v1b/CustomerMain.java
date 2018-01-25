package project.v1b;

public class CustomerMain {
	public static void main(String[] args) {

		CustomerService ctsrv = new CustomerServiceImpl();

		// 고객 데이터 객체 생성
		CustomerVO cvo = null;

		cvo = new CustomerVO(1, "박지성", "810101-1xxxxx", "영국 런던", "000-5000-0001");
		ctsrv.addCustomer(cvo);
		cvo = new CustomerVO(2, "김연아", "900101-2xxxxx", "한국 서울", "000-6000-0001");
		ctsrv.addCustomer(cvo);
		cvo = new CustomerVO(3, "장미란", "830101-3xxxxx", "한국 강원도", "000-7000-0001");
		ctsrv.addCustomer(cvo);
		cvo = new CustomerVO(4, "추신수", "720101-4xxxxx", "미국 뉴욕", "000-8000-0001");
		ctsrv.addCustomer(cvo);

		// 고객 데이터 추가
		ctsrv.addCustomer(cvo);
		System.out.println(cvo);

		// 고객 데이터 수정
		cvo = new CustomerVO(2, "김연아", "900101-2xxxxx", "한국서울", "000-6000-0001");
		ctsrv.modifyCustomer(cvo);

		// 고객 데이터 삭제
		ctsrv.removeCustomer("박지성");
	}
}
