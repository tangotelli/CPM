package model;

public class Package {

	private String packageCode;
	private String packageName;
	private String parkCode;
	private String accomodationCode;
	private int days;
	private double childPackagePrice;
	private double adultPackagePrice;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((packageCode == null) ? 0 : packageCode.hashCode());
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
		Package other = (Package) obj;
		if (packageCode == null) {
			if (other.packageCode != null)
				return false;
		} else if (!packageCode.equals(other.packageCode))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Package [packageCode=" + packageCode + ", packageName="
				+ packageName + ", parkCode=" + parkCode + ", accomodationCode="
				+ accomodationCode + ", days=" + days + ", childPackagePrice="
				+ childPackagePrice + ", adultPackagePrice=" + adultPackagePrice
				+ "]";
	}
	
	public String getPackageCode() {
		return packageCode;
	}
	
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}
	
	public String getPackageName() {
		return packageName;
	}
	
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	public String getParkCode() {
		return parkCode;
	}
	
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	
	public String getAccomodationCode() {
		return accomodationCode;
	}
	
	public void setAccomodationCode(String accomodationCode) {
		this.accomodationCode = accomodationCode;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public double getChildPackagePrice() {
		return childPackagePrice;
	}
	
	public void setChildPackagePrice(double childPackagePrice) {
		this.childPackagePrice = childPackagePrice;
	}
	
	public double getAdultPackagePrice() {
		return adultPackagePrice;
	}
	
	public void setAdultPackagePrice(double adultPackagePrice) {
		this.adultPackagePrice = adultPackagePrice;
	}
}
