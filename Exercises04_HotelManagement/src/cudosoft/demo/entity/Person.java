package cudosoft.demo.entity;

public class Person {
	private String fullName;
	private int age;
	private Address address;

	public Person() {
		super();
	}

	public Person(String fullName, int age, Address address) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
