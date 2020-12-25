package demoInheritance;

public class Address {
	
	private int no;
	private String streetName;
	private String cityName;
	private int zip;
	
	public Address() {
	}

	@Override
	public String toString() {
		return "Address [no=" + no + ", streetName=" + streetName + ", cityName=" + cityName + ", zip=" + zip + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Address(int no, String streetName, String cityName, int zip) {
		this.no = no;
		this.streetName = streetName;
		this.cityName = cityName;
		this.zip = zip;
	}

}
