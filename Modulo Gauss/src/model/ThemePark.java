package model;

public class ThemePark {

	private String parkCode;
	private String parkName;
	private String country;
	private String city;
	private String description;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((parkCode == null) ? 0 : parkCode.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThemePark other = (ThemePark) obj;
		if (parkCode == null) {
			if (other.parkCode != null)
				return false;
		} else if (!parkCode.equals(other.parkCode))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ThemePark [parkCode=" + parkCode + ", parkName=" + parkName
				+ ", country=" + country + ", city=" + city + ", description="
				+ description + "]";
	}
	
	public String getParkCode() {
		return parkCode;
	}
	
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	
	public String getParkName() {
		return parkName;
	}
	
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
