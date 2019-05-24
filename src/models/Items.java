package models;

public abstract class Items {
	private int idItem;

	private String title;

	public Items(int idItem, String title) {
		this.idItem = idItem;
		this.title = title;
	}

	public void checkOutItem() {

	}

	public void checkInItem() {

	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
