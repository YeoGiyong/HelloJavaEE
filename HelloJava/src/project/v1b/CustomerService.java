package project.v1b;

public interface CustomerService {
	// 고객 데이터의 저장,조회,수정,삭제 디자인
	void addCustomer(CustomerVO cvo); // 저장

	String getCustomer(); // 조회

	String getCustomer(String name); // 조회

	void modifyCustomer(CustomerVO cvo); // 수정

	void removeCustomer(String name); // 삭제
}
