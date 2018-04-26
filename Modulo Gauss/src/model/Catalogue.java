package model;

import java.util.Map;

public class Catalogue {

	private Map<String, Ticket> tickets;
	private Map<String, Accomodation> accomodations;
	private Map<String, ThemePark> parks;
	private Map<String, Package> packages;
	
	public Map<String, Ticket> getTickets() {
		return tickets;
	}
	
	public void setTickets(Map<String, Ticket> tickets) {
		this.tickets = tickets;
	}
	
	public Map<String, Accomodation> getAccomodations() {
		return accomodations;
	}
	
	public void setAccomodations(Map<String, Accomodation> accomodations) {
		this.accomodations = accomodations;
	}
	
	public Map<String, ThemePark> getParks() {
		return parks;
	}
	
	public void setParks(Map<String, ThemePark> parks) {
		this.parks = parks;
	}
	
	public Map<String, Package> getPackages() {
		return packages;
	}
	
	public void setPackages(Map<String, Package> packages) {
		this.packages = packages;
	}
}
