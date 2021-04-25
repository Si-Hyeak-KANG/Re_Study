package ch04;

//������ �Ӽ� : ���� ���̵�, ���� �̸�, ���� ���, ���ʽ� ����Ʈ, ���ʽ� ����Ʈ ��������
//�Ϲ� ������ ��� ��ǰ ���Ž� 1%�� ���ʽ� ����Ʈ ����
public class Customer {

	protected int customerID; //protected : �ܺ� Ŭ������ ������ �Ұ��� ������ ����Ŭ������ ���� ����
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer(int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1%

	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}