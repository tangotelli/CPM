package model;

public class Accomodation {

	private String accomodationCode;
	private String accomodationName;
	private AccomodationType type;
	private int category;
	private String parkCode;
	private int capacity;
	private double price;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accomodationCode == null) ? 0
				: accomodationCode.hashCode());
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
		Accomodation other = (Accomodation) obj;
		if (accomodationCode == null) {
			if (other.accomodationCode != null)
				return false;
		} else if (!accomodationCode.equals(other.accomodationCode))
			return false;
		if (parkCode == null) {
			if (other.parkCode != null)
				return false;
		} else if (!parkCode.equals(other.parkCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Accomodation [accomodationCode=" + accomodationCode
				+ ", accomodationName=" + accomodationName + ", type=" + type
				+ ", category=" + category + ", parkCode=" + parkCode
				+ ", capacity=" + capacity + ", price=" + price + "]";
	}
	
	public String getAccomodationCode() {
		return accomodationCode;
	}
	
	public void setAccomodationCode(String accomodationCode) {
		this.accomodationCode = accomodationCode;
	}
	
	public String getAccomodationName() {
		return accomodationName;
	}
	
	public void setAccomodationName(String accomodationName) {
		this.accomodationName = accomodationName;
	}
	
	public AccomodationType getType() {
		return type;
	}
	
	public void setType(AccomodationType type) {
		this.type = type;
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setCategory(int category) {
		this.category = category;
	}
	
	public String getParkCode() {
		return parkCode;
	}
	
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
