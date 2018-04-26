package model;

public class Ticket {

	private String ticketCode;
	private String parkCode;
	private double childTicketPrice;
	private double adultTicketPrice;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((parkCode == null) ? 0 : parkCode.hashCode());
		result = prime * result
				+ ((ticketCode == null) ? 0 : ticketCode.hashCode());
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
		Ticket other = (Ticket) obj;
		if (parkCode == null) {
			if (other.parkCode != null)
				return false;
		} else if (!parkCode.equals(other.parkCode))
			return false;
		if (ticketCode == null) {
			if (other.ticketCode != null)
				return false;
		} else if (!ticketCode.equals(other.ticketCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [ticketCode=" + ticketCode + ", parkCode=" + parkCode
				+ ", childTicketPrice=" + childTicketPrice
				+ ", adultTicketPrice=" + adultTicketPrice + "]";
	}
	
	public String getTicketCode() {
		return ticketCode;
	}
	
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	
	public String getParkCode() {
		return parkCode;
	}
	
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	
	public double getChildTicketPrice() {
		return childTicketPrice;
	}
	
	public void setChildTicketPrice(double childTicketPrice) {
		this.childTicketPrice = childTicketPrice;
	}
	
	public double getAdultTicketPrice() {
		return adultTicketPrice;
	}
	
	public void setAdultTicketPrice(double adultTicketPrice) {
		this.adultTicketPrice = adultTicketPrice;
	}
}
