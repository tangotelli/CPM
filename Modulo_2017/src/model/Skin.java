package model;

import model.types.Category;

public class Skin {
	
	private long id;
	private String name;
	private float price;
	private Category type;
	private String image;
	
	
	
	public Skin(long id, String name, float price, Category type,
			String image) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.image = image;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getType() {
		return type;
	}
	public void setType(Category type) {
		this.type = type;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Skin other = (Skin) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Skin [id=" + id + ", name=" + name + ", price=" + price
				+ ", type=" + type + ", image=" + image + "]";
	}
	
	
}
