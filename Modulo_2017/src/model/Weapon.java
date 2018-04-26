package model;

import model.types.Category;

public class Weapon {

	private long id;
	private String name;
	private Category type;
	private int ammo;
	private float damage;
	private float price;
	private String image;
	
	public Weapon(long id, String name, Category type, int ammo, float damage,
			float price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.ammo = ammo;
		this.damage = damage;
		this.price = price;
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

	public Category getType() {
		return type;
	}

	public void setType(Category type) {
		this.type = type;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
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
		Weapon other = (Weapon) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Weapon [id=" + id + ", name=" + name + ", type=" + type
				+ ", ammo=" + ammo + ", damage=" + damage + ", price=" + price
				+ ", image=" + image + "]";
	}
	
}
