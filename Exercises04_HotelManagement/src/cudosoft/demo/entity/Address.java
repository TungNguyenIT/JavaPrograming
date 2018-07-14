package cudosoft.demo.entity;

public class Address {
	private int houseNumber;
	private String alley;
	private String street;
	private String wards;
	private String districts;
	private String city;

	public Address() {
		super();
	}

	public Address(int houseNumber, String alley, String street, String wards,
			String districts, String city) {
		super();
		this.houseNumber = houseNumber;
		this.alley = alley;
		this.street = street;
		this.wards = wards;
		this.districts = districts;
		this.city = city;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAlley() {
		return alley;
	}

	public void setAlley(String alley) {
		this.alley = alley;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWards() {
		return wards;
	}

	public void setWards(String wards) {
		this.wards = wards;
	}

	public String getDistricts() {
		return districts;
	}

	public void setDistricts(String districts) {
		this.districts = districts;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
