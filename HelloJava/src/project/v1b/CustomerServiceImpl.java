package project.v1b;

public class CustomerServiceImpl implements CustomerService {

	@Override // 생성

	public void addCustomer(CustomerVO cvo) {
		System.out.println("고객의 데이터가 생성 되었습니다");
	}

	@Override // 조회
	public String getCustomer() {
		String out = "고객의 데이터를 조회합니다";
		return out;
	}

	@Override // 조회
	public String getCustomer(String name) {
		return name;
	}

	@Override // 수정
	public void modifyCustomer(CustomerVO cvo) {
		System.out.println("고객의 데이터가 수정되었습니다");
	}

	@Override // 삭제
	public void removeCustomer(String name) {
		System.out.println("고객의 데이터가 삭제되었습니다");
	}
}
