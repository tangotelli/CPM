package model;

public class Pack {
	
	private long idPack;
	private long idSkin;
	private long idWeapon;
	private float price;
	private String name;
	
	public Pack(long idPack, long idSkin, long idWeapon, float price,
			String name) {
		super();
		this.idPack = idPack;
		this.idSkin = idSkin;
		this.idWeapon = idWeapon;
		this.price = price;
		this.name = name;
	}

	public long getIdPack() {
		return idPack;
	}

	public void setIdPack(long idPack) {
		this.idPack = idPack;
	}

	public long getIdSkin() {
		return idSkin;
	}

	public void setIdSkin(long idSkin) {
		this.idSkin = idSkin;
	}

	public long getIdWeapon() {
		return idWeapon;
	}

	public void setIdWeapon(long idWeapon) {
		this.idWeapon = idWeapon;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idPack ^ (idPack >>> 32));
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
		Pack other = (Pack) obj;
		if (idPack != other.idPack)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pack [idPack=" + idPack + ", idSkin=" + idSkin + ", idWeapon="
				+ idWeapon + ", price=" + price + ", name=" + name + "]";
	}
	
}
